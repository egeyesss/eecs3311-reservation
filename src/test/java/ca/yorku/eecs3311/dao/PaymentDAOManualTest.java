package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.enums.PaymentMethod;
import ca.yorku.eecs3311.model.payment.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentDAOManualTest {

    private PaymentDAO paymentDAO;
    private Path tempCsvPath;

    @BeforeEach
    public void setUp() throws Exception {
        paymentDAO = new PaymentDAO();
        // Create a temporary file so we don't overwrite the real database
        tempCsvPath = Files.createTempFile("test_payments", ".csv");

        // Use Reflection to change the private FILE_PATH constant inside PaymentDAO
        Field pathField = PaymentDAO.class.getDeclaredField("FILE_PATH");
        pathField.setAccessible(true);
        pathField.set(paymentDAO, tempCsvPath.toString());
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(tempCsvPath);
    }

    @Test
    public void testSaveAndLoadAll() {
        Payment p1 = new Payment("B-100", "U-1", 25.0, PaymentMethod.CREDIT_CARD, true);
        p1.setStatus("COMPLETED");

        // Save creates the file and writes the row
        paymentDAO.save(p1);

        List<Payment> loaded = paymentDAO.loadAll();
        assertEquals(1, loaded.size());

        Payment loadedPayment = loaded.get(0);
        assertEquals("B-100", loadedPayment.getBookingID());
        assertEquals(25.0, loadedPayment.getAmount(), 0.001);
        assertEquals(PaymentMethod.CREDIT_CARD, loadedPayment.getPaymentMethod());
        assertTrue(loadedPayment.isDeposit());
        assertEquals("COMPLETED", loadedPayment.getStatus());
    }

    @Test
    public void testFindByIdAndFindByBookingId() {
        Payment p1 = new Payment("B-200", "U-2", 50.0, PaymentMethod.DEBIT_CARD, false);
        paymentDAO.save(p1);

        Payment foundById = paymentDAO.findById(p1.getPaymentID());
        assertNotNull(foundById);
        assertEquals("B-200", foundById.getBookingID());

        List<Payment> foundByBooking = paymentDAO.findByBookingId("B-200");
        assertEquals(1, foundByBooking.size());
        assertEquals(p1.getPaymentID(), foundByBooking.get(0).getPaymentID());

        assertNull(paymentDAO.findById("non-existent-id"));
    }

    @Test
    public void testParseMalformedRowIsSkipped() throws Exception {
        // Write a garbage row into the temp CSV
        String badData = "paymentID,bookingID,userId,amount,paymentMethod,paymentDate,transactionID,status,isDeposit\n" +
                "bad,row,with,missing,columns\n";
        Files.writeString(tempCsvPath, badData);

        // It should catch the exception silently and return an empty list, NOT crash
        List<Payment> loaded = paymentDAO.loadAll();
        assertTrue(loaded.isEmpty());
    }

    @Test
    public void testParseRowThrowsOnTooFewColumns() throws Exception {
        Method parseRow = PaymentDAO.class.getDeclaredMethod("parseRow", String[].class);
        parseRow.setAccessible(true);

        assertThrows(Exception.class, () -> parseRow.invoke(paymentDAO, (Object) new String[]{"1", "2"}));
    }
}