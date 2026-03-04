package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;

import java.time.LocalDateTime;

public class Student extends User {

    private String studentID;
    private String program;
    private int yearOfStudy;

    // Standard rate for students ($/hr)
    private static final double HOURLY_RATE = 5.00;

    public Student(String email, String password, String department,
                   String studentID, String program, int yearOfStudy) {
        super(email, password, UserType.STUDENT, department);
        this.studentID = studentID;
        this.program = program;
        this.yearOfStudy = yearOfStudy;
    }

    // CSV constructor
    public Student(String userId, String email, String password, AccountStatus accountStatus,
                   LocalDateTime registrationDate, String department,
                   String studentID, String program, int yearOfStudy) {
        super(userId, email, password, UserType.STUDENT, accountStatus, registrationDate, department);
        this.studentID = studentID;
        this.program = program;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String getCredentialNumber() { return studentID; }

    @Override
    public double getHourlyRate() { return HOURLY_RATE; }

    public String getStudentID() { return studentID; }
    public String getProgram() { return program; }
    public int getYearOfStudy() { return yearOfStudy; }

    public void setStudentID(String studentID) { this.studentID = studentID; }
    public void setProgram(String program) { this.program = program; }
    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }

    @Override
    public String toString() {
        return "Student{studentID='" + studentID + "', program='" + program +
               "', yearOfStudy=" + yearOfStudy + ", " + super.toString() + "}";
    }
}
