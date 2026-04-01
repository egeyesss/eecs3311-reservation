package ca.yorku.eecs3311.model.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceManualTest {

    private PaymentService paymentService;
    private PaymentStrategy mockStrategy;

    @BeforeEach
    public void setUp() {
        // A simple anonymous inner class to mock a successful payment strategy
        mockStrategy = new PaymentStrategy() {
            @Override public boolean processPayment(double amount) { return amount > 0; }
            @Override public boolean validatePayment() { return true; }
            @Override public String getPaymentDetails() { return "MockDetails"; }
        };
        paymentService = new PaymentService(mockStrategy);
    }

    @Test
    public void testSetStrategyThrowsOnNull() {
        assertThrows(IllegalArgumentException.class, () -> paymentService.setStrategy(null));
    }

    @Test
    public void testExecutePaymentThrowsOnNullStrategyOrNegativeAmount() {
        PaymentService emptyService = new PaymentService();
        assertThrows(IllegalStateException.class, () -> emptyService.executePayment(50.0));
        assertThrows(IllegalArgumentException.class, () -> paymentService.executePayment(-10.0));
        assertThrows(IllegalArgumentException.class, () -> paymentService.executePayment(0.0));
    }

    @Test
    public void testChargeFinalAmountCalculatesRemainingCorrectly() {
        // Total is 100, deposit paid is 40. Remaining should be 60.
        assertTrue(paymentService.chargeFinalAmount(100.0, 40.0));

        // If deposit covers everything, it should return true immediately without charging
        assertTrue(paymentService.chargeFinalAmount(50.0, 50.0));
    }

    @Test
    public void testProcessRefundThrowsOnNegative() {
        assertThrows(IllegalArgumentException.class, () -> paymentService.processRefund(-5.0));
        assertTrue(paymentService.processRefund(10.0)); // Placeholder logic returns true
    }

    @Test
    public void testDelegationMethods() {
        assertTrue(paymentService.validatePaymentMethod());
        assertEquals("MockDetails", paymentService.getPaymentDetails());
        assertNotNull(paymentService.getStrategy());

        PaymentService emptyService = new PaymentService();
        assertFalse(emptyService.validatePaymentMethod());
        assertEquals("No payment strategy set.", emptyService.getPaymentDetails());
    }
}