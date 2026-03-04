package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.equipment.Lab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Manager extends User {

    private String managerID;
    private List<Lab> assignedLabs;
    private List<String> permissions;

    private static final double HOURLY_RATE = 0.00;

    public Manager(String email, String password, String department, String managerID) {
        super(email, password, UserType.MANAGER, department);
        this.managerID = managerID;
        this.assignedLabs = new ArrayList<>();
        this.permissions = new ArrayList<>();
    }

    // CSV constructor
    public Manager(String userId, String email, String password, AccountStatus accountStatus,
                   LocalDateTime registrationDate, String department, String managerID) {
        super(userId, email, password, UserType.MANAGER, accountStatus, registrationDate, department);
        this.managerID = managerID;
        this.assignedLabs = new ArrayList<>();
        this.permissions = new ArrayList<>();
    }

    @Override
    public String getCredentialNumber() { return managerID; }

    @Override
    public double getHourlyRate() { return HOURLY_RATE; }

    public void assignLab(Lab lab) {
        if (!assignedLabs.contains(lab)) {
            assignedLabs.add(lab);
        }
    }

    public void removeLab(Lab lab) {
        assignedLabs.remove(lab);
    }

    public void addPermission(String permission) {
        if (!permissions.contains(permission)) {
            permissions.add(permission);
        }
    }

    public void removePermission(String permission) {
        permissions.remove(permission);
    }

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }

    public String getManagerID() { return managerID; }
    public List<Lab> getAssignedLabs() { return assignedLabs; }
    public List<String> getPermissions() { return permissions; }

    public void setManagerID(String managerID) { this.managerID = managerID; }
    public void setAssignedLabs(List<Lab> assignedLabs) { this.assignedLabs = assignedLabs; }
    public void setPermissions(List<String> permissions) { this.permissions = permissions; }

    @Override
    public String toString() {
        return "Manager{managerID='" + managerID + "', assignedLabs=" + assignedLabs.size() +
               ", permissions=" + permissions + ", " + super.toString() + "}";
    }
}
