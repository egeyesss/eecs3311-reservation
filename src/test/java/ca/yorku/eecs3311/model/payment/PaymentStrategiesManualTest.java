package ca.yorku.eecs3311.model.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentStrategiesManualTest {

    @Test
    public void testCreditCardValidationAndProcessing() {
        // 1. Happy Path & Validations
        CreditCardPayment validCard = new CreditCardPayment("12345678901234", "12/28", "123", "John Doe");
        assertTrue(validCard.validatePayment());
        assertTrue(validCard.processPayment(50.0));
        assertFalse(validCard.processPayment(-10.0));
        assertTrue(validCard.getPaymentDetails().contains("John Doe"));

        // 2. Test Getters (Missed Instructions)
        assertEquals("12345678901234", validCard.getCardNumber());
        assertEquals("12/28", validCard.getExpiryDate());
        assertEquals("123", validCard.getCvv());
        assertEquals("John Doe", validCard.getCardHolderName());

        // 3. Isolate Branches (Short-Circuit Testing)
        // Branch 1: Card Number Null or Short
        assertFalse(new CreditCardPayment(null, "12/28", "123", "John Doe").validatePayment());
        assertFalse(new CreditCardPayment("123", "12/28", "123", "John Doe").validatePayment());

        // Branch 2: Expiry Null or Empty
        assertFalse(new CreditCardPayment("12345678901234", null, "123", "John Doe").validatePayment());
        assertFalse(new CreditCardPayment("12345678901234", "   ", "123", "John Doe").validatePayment());

        // Branch 3: CVV Null or Short
        assertFalse(new CreditCardPayment("12345678901234", "12/28", null, "John Doe").validatePayment());
        assertFalse(new CreditCardPayment("12345678901234", "12/28", "12", "John Doe").validatePayment());

        // Branch 4: Name Null or Empty
        assertFalse(new CreditCardPayment("12345678901234", "12/28", "123", null).validatePayment());
        assertFalse(new CreditCardPayment("12345678901234", "12/28", "123", "   ").validatePayment());

        // Ensure a failed validation blocks processing
        assertFalse(new CreditCardPayment("123", "12/28", "123", "John Doe").processPayment(50.0));
    }

    @Test
    public void testDebitCardValidationAndProcessing() {
        // 1. Happy Path & Validations
        DebitCardPayment debit = new DebitCardPayment("12345678901234", "1234", "Jane Doe", 100.0);
        assertTrue(debit.validatePayment());
        assertTrue(debit.processPayment(60.0));
        assertEquals(40.0, debit.getAccountBalance(), 0.001);
        assertFalse(debit.processPayment(50.0)); // Insufficient funds
        assertFalse(debit.processPayment(-10.0)); // Negative amount
        assertTrue(debit.getPaymentDetails().contains("Jane Doe"));

        // 2. Test Getters (Missed Instructions)
        assertEquals("12345678901234", debit.getCardNumber());
        assertEquals("Jane Doe", debit.getCardHolderName());

        // 3. Isolate Branches (Short-Circuit Testing)
        // Branch 1: Card Number Null or Short
        assertFalse(new DebitCardPayment(null, "1234", "Jane Doe", 100.0).validatePayment());
        assertFalse(new DebitCardPayment("123", "1234", "Jane Doe", 100.0).validatePayment());

        // Branch 2: PIN Null or Short
        assertFalse(new DebitCardPayment("12345678901234", null, "Jane Doe", 100.0).validatePayment());
        assertFalse(new DebitCardPayment("12345678901234", "12", "Jane Doe", 100.0).validatePayment());

        // Branch 3: Name Null or Empty
        assertFalse(new DebitCardPayment("12345678901234", "1234", null, 100.0).validatePayment());
        assertFalse(new DebitCardPayment("12345678901234", "1234", "   ", 100.0).validatePayment());
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

    @Test
    public void testResearchGrantPaymentLogic() {
        // Test 1: Successful Validation and Processing
        ca.yorku.eecs3311.model.user.ResearchGrant activeGrant =
                new ca.yorku.eecs3311.model.user.ResearchGrant("G-1", "AI Study", "U-1", 1000.0, java.time.LocalDate.now().plusDays(30));
        ResearchGrantPayment payment = new ResearchGrantPayment(activeGrant);

        assertTrue(payment.validatePayment());
        assertTrue(payment.processPayment(200.0));
        // Ensure funds were actually deducted
        assertEquals(800.0, activeGrant.getRemainingFunds(), 0.001);

        // Test 2: Edge Cases (Negative amounts and Insufficient Funds)
        assertFalse(payment.processPayment(-50.0));
        assertFalse(payment.processPayment(5000.0));

        // Test 3: Expired Grant Rejection
        ca.yorku.eecs3311.model.user.ResearchGrant expiredGrant =
                new ca.yorku.eecs3311.model.user.ResearchGrant("G-2", "Old Study", "U-1", 1000.0, java.time.LocalDate.now().minusDays(1));
        ResearchGrantPayment expiredPayment = new ResearchGrantPayment(expiredGrant);

        assertFalse(expiredPayment.validatePayment());
        assertFalse(expiredPayment.processPayment(100.0));

        // Test 4: Getters and Null Safety
        assertTrue(payment.getPaymentDetails().contains("G-1"));
        assertEquals(activeGrant, payment.getGrant());
        assertThrows(IllegalArgumentException.class, () -> new ResearchGrantPayment(null));
    }

}