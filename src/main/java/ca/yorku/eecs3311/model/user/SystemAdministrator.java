package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;

import java.time.LocalDateTime;

public class SystemAdministrator extends Manager {

    private String adminID;
    private boolean isHeadCoordinator;

    public SystemAdministrator(String email, String password, String department,
                               String managerID, String adminID, boolean isHeadCoordinator) {
        super(email, password, department, managerID);
        this.adminID = adminID;
        this.isHeadCoordinator = isHeadCoordinator;
        // Override userType to ADMIN
        this.setAccountStatus(AccountStatus.ACTIVE);
    }

    // CSV constructor
    public SystemAdministrator(String userId, String email, String password, AccountStatus accountStatus,
                               LocalDateTime registrationDate, String department,
                               String managerID, String adminID, boolean isHeadCoordinator) {
        super(userId, email, password, accountStatus, registrationDate, department, managerID);
        this.adminID = adminID;
        this.isHeadCoordinator = isHeadCoordinator;
    }

    @Override
    public String getCredentialNumber() { return adminID; }

    @Override
    public UserType getUserType() { return UserType.ADMIN; }

    public String getAdminID() { return adminID; }
    public boolean isHeadCoordinator() { return isHeadCoordinator; }

    public void setAdminID(String adminID) { this.adminID = adminID; }
    public void setHeadCoordinator(boolean headCoordinator) { this.isHeadCoordinator = headCoordinator; }

    @Override
    public String toString() {
        return "SystemAdministrator{adminID='" + adminID + "', isHeadCoordinator=" + isHeadCoordinator +
               ", " + super.toString() + "}";
    }
}
