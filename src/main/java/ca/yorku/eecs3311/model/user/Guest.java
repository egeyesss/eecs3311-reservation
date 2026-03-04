package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;

import java.time.LocalDateTime;

public class Guest extends User {

    private String guestID;
    private String organization;
    private String sponsorEmail;

    private static final double HOURLY_RATE = 15.00;

    public Guest(String email, String password, String department,
                 String guestID, String organization, String sponsorEmail) {
        super(email, password, UserType.GUEST, department);
        this.guestID = guestID;
        this.organization = organization;
        this.sponsorEmail = sponsorEmail;
    }

    // CSV constructor
    public Guest(String userId, String email, String password, AccountStatus accountStatus,
                 LocalDateTime registrationDate, String department,
                 String guestID, String organization, String sponsorEmail) {
        super(userId, email, password, UserType.GUEST, accountStatus, registrationDate, department);
        this.guestID = guestID;
        this.organization = organization;
        this.sponsorEmail = sponsorEmail;
    }

    @Override
    public String getCredentialNumber() { return guestID; }

    @Override
    public double getHourlyRate() { return HOURLY_RATE; }

    public String getGuestID() { return guestID; }
    public String getOrganization() { return organization; }
    public String getSponsorEmail() { return sponsorEmail; }

    public void setGuestID(String guestID) { this.guestID = guestID; }
    public void setOrganization(String organization) { this.organization = organization; }
    public void setSponsorEmail(String sponsorEmail) { this.sponsorEmail = sponsorEmail; }

    @Override
    public String toString() {
        return "Guest{guestID='" + guestID + "', organization='" + organization +
               "', sponsorEmail='" + sponsorEmail + "', " + super.toString() + "}";
    }
}
