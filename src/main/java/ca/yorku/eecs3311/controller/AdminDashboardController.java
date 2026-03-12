package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.User;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.List;

public class AdminDashboardController {

    private final BookingFacade facade = new BookingFacade();

    @FXML private TableView<User> usersTable;
    @FXML private TableView<Booking> bookingsTable;

    // Create Manager Fields
    @FXML private TextField managerEmailField;
    @FXML private PasswordField managerPasswordField;
    @FXML private TextField managerDeptField;
    @FXML private TextField managerCredField;

    // Booking Search Field
    @FXML private TextField targetIdField;

    @FXML
    public void initialize() {
        // Setup table columns (Phase 8)
    }

    @FXML
    public void handleCreateManager() {
        String email = managerEmailField.getText();
        String password = managerPasswordField.getText();
        String department = managerDeptField.getText();
        String credNumber = managerCredField.getText();

        try {
            facade.registerUser(UserType.MANAGER, email, password, department, credNumber, null, null, null);
            showAlert("Success", "Manager account created successfully.");
            loadAllUsers();
        } catch (Exception e) {
            showAlert("Error", "Failed to create manager: " + e.getMessage());
        }
    }

    @FXML
    public void handleApproveUser() {
        User selectedUser = usersTable.getSelectionModel().getSelectedItem();
        if (selectedUser != null) {
            try {
                facade.approveUser(selectedUser.getUserId());
                showAlert("Success", "User " + selectedUser.getEmail() + " has been approved.");
                loadAllUsers(); // Refresh table
            } catch (Exception e) {
                showAlert("Error", "Failed to approve user: " + e.getMessage());
            }
        }
    }

    @FXML
    public void loadAllUsers() {
        try {
            List<User> allUsers = facade.getAllUsers();
            if (usersTable != null) {
                usersTable.setItems(FXCollections.observableArrayList(allUsers));
            }
        } catch (Exception e) {
            showAlert("Error", "Failed to load users: " + e.getMessage());
        }
    }

    @FXML
    public void handleLoadBookings() {
        String targetID = targetIdField.getText();
        if (targetID != null && !targetID.trim().isEmpty()) {
            // By default, trying to load as User ID. If no results, trying as Equipment ID.
            List<Booking> bookings = facade.getBookingsByUser(targetID.trim());
            if (bookings == null || bookings.isEmpty()) {
                bookings = facade.getBookingsByEquipment(targetID.trim());
            }

            if (bookingsTable != null) {
                bookingsTable.setItems(FXCollections.observableArrayList(bookings));
            }
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}