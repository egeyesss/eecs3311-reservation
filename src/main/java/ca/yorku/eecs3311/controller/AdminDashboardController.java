package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.user.User;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class AdminDashboardController {

    private final BookingFacade facade = new BookingFacade();

    // User Management Fields
    @FXML private TableView<User> usersTable;
    @FXML private TableColumn<User, String> userIdCol;
    @FXML private TableColumn<User, String> emailCol;
    @FXML private TableColumn<User, String> userTypeCol;
    @FXML private TableColumn<User, String> statusCol;

    // Booking Oversight Fields
    @FXML private TableView<Booking> bookingsTable;
    @FXML private TableColumn<Booking, String> bookingIdCol;
    @FXML private TableColumn<Booking, String> targetCol;
    @FXML private TableColumn<Booking, String> bookingEquipCol;
    @FXML private TableColumn<Booking, String> bookingStatusCol;
    @FXML private TableColumn<Booking, LocalDateTime> bookingStartCol;
    @FXML private TableColumn<Booking, LocalDateTime> bookingEndCol;

    @FXML private TextField targetIdField;

    // Create Manager Fields
    @FXML private TextField managerEmailField;
    @FXML private PasswordField managerPasswordField;
    @FXML private TextField managerDeptField;
    @FXML private TextField managerCredField;

    @FXML
    public void initialize() {
        // --- User Table Mapping ---
        userIdCol.setCellValueFactory(new PropertyValueFactory<>("userId"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        userTypeCol.setCellValueFactory(new PropertyValueFactory<>("userType"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("accountStatus"));

        // --- Booking Table Mapping ---
        bookingIdCol.setCellValueFactory(new PropertyValueFactory<>("bookingID"));

        // Custom cell value for User ID
        targetCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getUser().getUserId()));

        // Custom cell value for Equipment Name
        bookingEquipCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getEquipment().getName()));

        bookingStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        bookingStartCol.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        bookingEndCol.setCellValueFactory(new PropertyValueFactory<>("endTime"));
    }

    @FXML
    public void loadAllUsers() {
        usersTable.setItems(FXCollections.observableArrayList(facade.getAllUsers()));
    }

    @FXML
    public void handleApproveUser() {
        User selected = usersTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            facade.approveUser(selected.getUserId());
            loadAllUsers();
            showAlert("Success", "User account activated.");
        }
    }

    @FXML
    public void handleLoadBookings() {
        String searchId = targetIdField.getText().trim();
        List<Booking> results;

        if (searchId.isEmpty()) {
            // Logic: Load everything if search is empty
            results = facade.getAllBookings();
        } else {
            // Search by User ID first, then Equipment ID
            results = facade.getBookingsByUser(searchId);
            if (results.isEmpty()) {
                results = facade.getBookingsByEquipment(searchId);
            }
        }
        bookingsTable.setItems(FXCollections.observableArrayList(results));
    }

    @FXML
    public void handleCreateManager() {
        try {
            facade.registerUser(
                    ca.yorku.eecs3311.model.enums.UserType.MANAGER,
                    managerEmailField.getText(),
                    managerPasswordField.getText(),
                    managerDeptField.getText(),
                    managerCredField.getText(),
                    null, null, null
            );
            showAlert("Success", "Manager account created.");
        } catch (Exception e) {
            showAlert("Error", e.getMessage());
        }
    }

    @FXML
    public void handleLogout() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usersTable.getScene().getWindow();
            Scene scene = new Scene(root, 900, 650);
            if (getClass().getResource("/styles/app.css") != null) {
                scene.getStylesheets().add(getClass().getResource("/styles/app.css").toExternalForm());
            }
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}