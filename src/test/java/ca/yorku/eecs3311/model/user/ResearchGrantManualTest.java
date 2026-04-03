package ca.yorku.eecs3311.model.user;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class ResearchGrantManualTest {

    @Test
    public void testGrantPropertiesAndValidation() {
        LocalDate future = LocalDate.now().plusDays(30);
        ResearchGrant grant = new ResearchGrant("RG-1", "BioResearch", "PI-Smith", 500.0, future);

        // Test Getters
        assertEquals("RG-1", grant.getGrantID());
        assertEquals("BioResearch", grant.getGrantName());
        assertEquals("PI-Smith", grant.getPrincipalInvestigator()); // FIXED HERE
        assertEquals(500.0, grant.getRemainingFunds(), 0.001);
        assertEquals(future, grant.getExpiryDate());

        // Test Validation (Active and Funded)
        assertTrue(grant.validateGrant());

        // Test Validation (Expired)
        LocalDate past = LocalDate.now().minusDays(1);
        ResearchGrant expired = new ResearchGrant("RG-2", "ChemResearch", "PI-Jones", 500.0, past);
        assertFalse(expired.validateGrant());

        // Test Validation (No Funds)
        ResearchGrant empty = new ResearchGrant("RG-3", "Physics", "PI-Davis", 0.0, future);
        assertFalse(empty.validateGrant());
    }

    @Test
    public void testAllocateFunds() {
        ResearchGrant grant = new ResearchGrant("RG-1", "Bio", "PI-Smith", 500.0, LocalDate.now().plusDays(30));

        // Test invalid negative deductions
        assertThrows(IllegalArgumentException.class, () -> grant.allocateFunds(-10.0));

        // Test successful deduction
        assertTrue(grant.allocateFunds(100.0));
        assertEquals(400.0, grant.getRemainingFunds(), 0.001);

        // Test insufficient funds deduction
        assertFalse(grant.allocateFunds(1000.0));
        assertEquals(400.0, grant.getRemainingFunds(), 0.001); // Balance should remain untouched
    }

    @Test
    public void testAllocateFundsThrowsWhenExpired() {
        // Additional test to catch the expiration exception you have in your logic!
        LocalDate past = LocalDate.now().minusDays(1);
        ResearchGrant expired = new ResearchGrant("RG-Expired", "Bio", "PI-Smith", 500.0, past);

        assertThrows(IllegalStateException.class, () -> expired.allocateFunds(50.0));
    }
}