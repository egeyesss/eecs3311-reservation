package ca.yorku.eecs3311.model.user;

import java.time.LocalDate;

public class ResearchGrant {

    private String grantID;
    private String grantName;
    private String principalInvestigator;
    private double availableFunds;
    private LocalDate expiryDate;

    public ResearchGrant(String grantID, String grantName, String principalInvestigator,
                         double availableFunds, LocalDate expiryDate) {
        this.grantID = grantID;
        this.grantName = grantName;
        this.principalInvestigator = principalInvestigator;
        this.availableFunds = availableFunds;
        this.expiryDate = expiryDate;
    }

    public boolean allocateFunds(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (!isValid()) throw new IllegalStateException("Grant has expired");
        if (availableFunds < amount) return false;
        availableFunds -= amount;
        return true;
    }

    public double getRemainingFunds() {
        return availableFunds;
    }

    public boolean validateGrant() {
        return isValid() && availableFunds > 0;
    }

    private boolean isValid() {
        return expiryDate != null && !LocalDate.now().isAfter(expiryDate);
    }

    public String getGrantID() { return grantID; }
    public String getGrantName() { return grantName; }
    public String getPrincipalInvestigator() { return principalInvestigator; }
    public double getAvailableFunds() { return availableFunds; }
    public LocalDate getExpiryDate() { return expiryDate; }

    public void setGrantID(String grantID) { this.grantID = grantID; }
    public void setGrantName(String grantName) { this.grantName = grantName; }
    public void setPrincipalInvestigator(String principalInvestigator) { this.principalInvestigator = principalInvestigator; }
    public void setAvailableFunds(double availableFunds) { this.availableFunds = availableFunds; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }

    @Override
    public String toString() {
        return "ResearchGrant{grantID='" + grantID + "', grantName='" + grantName +
               "', principalInvestigator='" + principalInvestigator +
               "', availableFunds=" + availableFunds + ", expiryDate=" + expiryDate + "}";
    }
}
