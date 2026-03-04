package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;

import java.time.LocalDateTime;

public class Faculty extends User {

    private String facultyID;
    private String position;

    private static final double HOURLY_RATE = 10.00;

    public Faculty(String email, String password, String department,
                   String facultyID, String position) {
        super(email, password, UserType.FACULTY, department);
        this.facultyID = facultyID;
        this.position = position;
    }

    // CSV constructor
    public Faculty(String userId, String email, String password, AccountStatus accountStatus,
                   LocalDateTime registrationDate, String department,
                   String facultyID, String position) {
        super(userId, email, password, UserType.FACULTY, accountStatus, registrationDate, department);
        this.facultyID = facultyID;
        this.position = position;
    }

    @Override
    public String getCredentialNumber() { return facultyID; }

    @Override
    public double getHourlyRate() { return HOURLY_RATE; }

    public String getFacultyID() { return facultyID; }
    public String getPosition() { return position; }

    public void setFacultyID(String facultyID) { this.facultyID = facultyID; }
    public void setPosition(String position) { this.position = position; }

    @Override
    public String toString() {
        return "Faculty{facultyID='" + facultyID + "', department='" + getDepartment() +
               "', position='" + position + "', " + super.toString() + "}";
    }
}
