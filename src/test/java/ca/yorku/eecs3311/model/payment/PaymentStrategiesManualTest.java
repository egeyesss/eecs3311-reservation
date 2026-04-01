package ca.yorku.eecs3311.model.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentStrategiesManualTest {

    @Test
    public void testCreditCardValidationAndProcessing() {
        CreditCardPayment validCard = new CreditCardPayment("12345678901234", "12/28", "123", "John Doe");
        assertTrue(validCard.validatePayment());
        assertTrue(validCard.processPayment(50.0));
        assertFalse(validCard.processPayment(-10.0));
        assertTrue(validCard.getPaymentDetails().contains("John Doe"));

        CreditCardPayment invalidCard = new CreditCardPayment("123", "", "12", null);
        assertFalse(invalidCard.validatePayment());
        assertFalse(invalidCard.processPayment(50.0)); // Should fail validation step
    }

    @Test
    public void testDebitCardValidationAndProcessing() {
        DebitCardPayment debit = new DebitCardPayment("12345678901234", "1234", "Jane Doe", 100.0);
        assertTrue(debit.validatePayment());

        // Process successful payment
        assertTrue(debit.processPayment(60.0));
        assertEquals(40.0, debit.getAccountBalance(), 0.001);

        // Process insufficient funds
        assertFalse(debit.processPayment(50.0));

        DebitCardPayment invalidDebit = new DebitCardPayment("123", null, "", 100.0);
        assertFalse(invalidDebit.validatePayment());
    }

    @Test
    public void testInstitutionalAccountLogic() {
        InstitutionalAccount acc = new InstitutionalAccount("ACC-1", "Biology", "U-1", 500.0);

        assertThrows(IllegalArgumentException.class, () -> acc.deductAmount(-10.0));
        assertThrows(IllegalArgumentException.class, () -> acc.addFunds(-10.0));

        assertTrue(acc.deductAmount(100.0));
        assertEquals(400.0, acc.getBalance(), 0.001);
        assertFalse(acc.deductAmount(1000.0)); // Insufficient funds

        InstitutionalAccountPayment payment = new InstitutionalAccountPayment(acc);
        assertTrue(payment.validatePayment());
        assertTrue(payment.processPayment(50.0));
        assertEquals(350.0, acc.getBalance(), 0.001);

        assertThrows(IllegalArgumentException.class, () -> new InstitutionalAccountPayment(null));
    }
}