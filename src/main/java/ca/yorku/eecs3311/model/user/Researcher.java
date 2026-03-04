package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;

import java.time.LocalDateTime;

public class Researcher extends User {

    private String researcherID;
    private String researchArea;
    private String grantNumber;

    private static final double HOURLY_RATE = 8.00;

    public Researcher(String email, String password, String department,
                      String researcherID, String researchArea, String grantNumber) {
        super(email, password, UserType.RESEARCHER, department);
        this.researcherID = researcherID;
        this.researchArea = researchArea;
        this.grantNumber = grantNumber;
    }

    // CSV constructor
    public Researcher(String userId, String email, String password, AccountStatus accountStatus,
                      LocalDateTime registrationDate, String department,
                      String researcherID, String researchArea, String grantNumber) {
        super(userId, email, password, UserType.RESEARCHER, accountStatus, registrationDate, department);
        this.researcherID = researcherID;
        this.researchArea = researchArea;
        this.grantNumber = grantNumber;
    }

    @Override
    public String getCredentialNumber() { return researcherID; }

    @Override
    public double getHourlyRate() { return HOURLY_RATE; }

    public String getResearcherID() { return researcherID; }
    public String getResearchArea() { return researchArea; }
    public String getGrantNumber() { return grantNumber; }

    public void setResearcherID(String researcherID) { this.researcherID = researcherID; }
    public void setResearchArea(String researchArea) { this.researchArea = researchArea; }
    public void setGrantNumber(String grantNumber) { this.grantNumber = grantNumber; }

    @Override
    public String toString() {
        return "Researcher{researcherID='" + researcherID + "', researchArea='" + researchArea +
               "', grantNumber='" + grantNumber + "', " + super.toString() + "}";
    }
}
