package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.payment.CreditCardPayment;
import ca.yorku.eecs3311.model.payment.PaymentStrategy;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDateTime;
import java.util.List;

public class UserDashboardController {

    private final BookingFacade facade = new BookingFacade();
    private String currentUserId;

    @FXML private TableView<Equipment> equipmentTable;
    @FXML private TableColumn<Equipment, String> eqIdCol;
    @FXML private TableColumn<Equipment, String> eqNameCol;
    @FXML private TableColumn<Equipment, String> eqCatCol;
    @FXML private TableColumn<Equipment, Double> eqRateCol;

    @FXML private TableView<Booking> bookingsTable;
    @FXML private TableColumn<Booking, String> bIdCol;
    @FXML private TableColumn<Booking, String> bEquipCol;
    @FXML private TableColumn<Booking, LocalDateTime> bStartCol;
    @FXML private TableColumn<Booking, String> bStatusCol;
    @FXML private TableColumn<Booking, LocalDateTime> bEndCol;
    @FXML private TableColumn<Booking, Double> bCostCol;

    @FXML
    public void initialize() {
        // Equipment Table Mapping
        eqIdCol.setCellValueFactory(new PropertyValueFactory<>("equipmentID"));
        eqNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        eqCatCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        eqRateCol.setCellValueFactory(new PropertyValueFactory<>("hourlyRate"));

        // Bookings Table Mapping
        bIdCol.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        // Custom lambda to show Equipment Name instead of the whole object
        bEquipCol.setCellValueFactory(cellData ->
                new javafx.beans.property.SimpleStringProperty(cellData.getValue().getEquipment().getName()));
        bStartCol.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        bStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        bCostCol.setCellValueFactory(new PropertyValueFactory<>("totalCost"));

        bEndCol.setCellValueFactory(new PropertyValueFactory<>("endTime"));
    }

    public void setCurrentUserId(String userId) {
        this.currentUserId = userId;
        loadAvailableEquipment();
        loadMyBookings();
    }

    @FXML
    public void loadAvailableEquipment() {
        List<Equipment> available = facade.getAvailableEquipment();
        if (equipmentTable != null) {
            equipmentTable.setItems(FXCollections.observableArrayList(available));
        }
    }

    @FXML
    public void loadMyBookings() {
        List<Booking> myBookings = facade.getBookingsByUser(currentUserId);
        if (bookingsTable != null) {
            bookingsTable.setItems(FXCollections.observableArrayList(myBookings));
        }
    }

    @FXML
    public void handleCreateBooking() {
        Equipment selected = equipmentTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("Selection Error", "Please select an equipment from the table first.");
            return;
        }

        try {
            // Set the booking to start immediately and last for 2 hours
            LocalDateTime start = LocalDateTime.now();
            LocalDateTime end = start.plusHours(2);

            facade.createBooking(currentUserId, selected.getEquipmentID(), start, end);

            // Refresh the tables to show the new PENDING booking
            loadMyBookings();
            loadAvailableEquipment();

            showAlert("Success", "Booking created! Status: PENDING.\n" +
                    "Please wait for a Manager to confirm your slot.");
        } catch (IllegalStateException e) {
            // This catches the "in use by another student" error we just implemented
            showAlert("Equipment Unavailable", e.getMessage());
        } catch (Exception e) {
            showAlert("Error", "An unexpected error occurred: " + e.getMessage());
        }
    }

    @FXML
    public void handleCancelBooking() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            facade.cancelBooking(selected.getBookingID());
            loadMyBookings();
        }
    }

    @FXML
    public void handleExtendBooking() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                LocalDateTime newEnd = selected.getEndTime().plusHours(1);
                facade.extendBooking(selected.getBookingID(), newEnd);
                loadMyBookings();
            } catch (IllegalStateException e) {
                showAlert("Action Denied", e.getMessage());
            }
        }
    }

    @FXML
    public void handleCompleteBooking() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                facade.completeBooking(selected.getBookingID());
                loadMyBookings();
                loadAvailableEquipment(); // Refresh so they see the equipment is AVAILABLE again
                showAlert("Success", "Booking completed. Thank you for using the lab!");
            } catch (IllegalStateException e) {
                showAlert("Action Denied", e.getMessage());
            }
        }
    }

    @FXML
    public void handleConfirmArrival() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                facade.confirmArrival(selected.getBookingID());
                loadMyBookings();
                showAlert("Success", "Arrival confirmed! Your booking is now ACTIVE.");
            } catch (IllegalStateException e) {
                // catches the "Cannot activate a PENDING booking" error
                showAlert("Action Denied", e.getMessage());
            }
        }
    }

    @FXML
    public void handlePayment() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            PaymentStrategy strategy = new CreditCardPayment("1234567890123456", "12/28", "123", "John Doe");
            boolean success = facade.processPayment(selected.getBookingID(), strategy);
            showAlert("Payment", success ? "Payment Successful" : "Payment Failed");
        }
    }

    @FXML
    public void handleLogout() {
        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("/view/login.fxml"));
            javafx.scene.Parent root = loader.load();
            javafx.stage.Stage stage = (javafx.stage.Stage) equipmentTable.getScene().getWindow();
            javafx.scene.Scene scene = new javafx.scene.Scene(root, 800, 600);
            scene.getStylesheets().add(getClass().getResource("/styles/app.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}