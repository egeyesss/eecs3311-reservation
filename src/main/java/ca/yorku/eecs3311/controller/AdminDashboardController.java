package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.User;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;

import java.util.List;

public class AdminDashboardController {

    private final BookingFacade facade = new BookingFacade();

    @FXML private TableView<User> usersTable;
    @FXML private TableView<Booking> bookingsTable;

    @FXML
    public void initialize() {
        // Setup table columns (Phase 8)
    }

    @FXML
    public void handleCreateManager(String email, String password, String department, String credNumber) {
        try {
            facade.registerUser(UserType.MANAGER, email, password, department, credNumber, null, null, null); //
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
                // Uses the newly implemented facade method to activate the user
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
            // Uses the newly implemented facade method
            List<User> allUsers = facade.getAllUsers();
            if (usersTable != null) {
                usersTable.setItems(FXCollections.observableArrayList(allUsers));
            }
        } catch (Exception e) {
            showAlert("Error", "Failed to load users: " + e.getMessage());
        }
    }

    @FXML
    public void loadAllBookings(String targetID, boolean isUserID) {
        // Flexible method to load by User or Equipment based on admin needs
        try {
            List<Booking> bookings;
            if (isUserID) {
                bookings = facade.getBookingsByUser(targetID);
            } else {
                bookings = facade.getBookingsByEquipment(targetID);
            }

            if (bookingsTable != null) {
                bookingsTable.setItems(FXCollections.observableArrayList(bookings));
            }
        } catch (Exception e) {
            showAlert("Error", "Failed to load bookings: " + e.getMessage());
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}