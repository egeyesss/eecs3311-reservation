package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class User {

    private String userId;
    private String email;
    private String password;
    private UserType userType;
    private AccountStatus accountStatus;
    private LocalDateTime registrationDate;
    private String department;

    protected User(String email, String password, UserType userType, String department) {
        this.userId = UUID.randomUUID().toString();
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.department = department;
        this.accountStatus = AccountStatus.PENDING;
        this.registrationDate = LocalDateTime.now();
    }

    // Constructor used when loading from CSV (userId already known)
    protected User(String userId, String email, String password, UserType userType,
                   AccountStatus accountStatus, LocalDateTime registrationDate, String department) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.accountStatus = accountStatus;
        this.registrationDate = registrationDate;
        this.department = department;
    }

    // Abstract methods each subclass must implement
    public abstract String getCredentialNumber();
    public abstract double getHourlyRate();

    // Concrete methods
    public boolean validateCredentials(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void updateProfile(String email, String department) {
        this.email = email;
        this.department = department;
    }

    public void activate() {
        this.accountStatus = AccountStatus.ACTIVE;
    }

    public void suspend() {
        this.accountStatus = AccountStatus.SUSPENDED;
    }

    public void deactivate() {
        this.accountStatus = AccountStatus.DEACTIVATED;
    }

    public boolean isActive() {
        return this.accountStatus == AccountStatus.ACTIVE;
    }

    // Getters
    public String getUserId() { return userId; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public UserType getUserType() { return userType; }
    public AccountStatus getAccountStatus() { return accountStatus; }
    public LocalDateTime getRegistrationDate() { return registrationDate; }
    public String getDepartment() { return department; }

    // Setters
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setAccountStatus(AccountStatus accountStatus) { this.accountStatus = accountStatus; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "User{userId='" + userId + "', email='" + email +
               "', userType=" + userType + ", accountStatus=" + accountStatus + "}";
    }
}
