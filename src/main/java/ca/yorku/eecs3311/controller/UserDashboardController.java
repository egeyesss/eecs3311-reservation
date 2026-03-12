package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.payment.CreditCardPayment;
import ca.yorku.eecs3311.model.payment.PaymentStrategy;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;

import java.time.LocalDateTime;
import java.util.List;

public class UserDashboardController {

    private final BookingFacade facade = new BookingFacade();
    private String currentUserId; // Should be set after login

    @FXML private TableView<Equipment> equipmentTable;
    @FXML private TableView<Booking> bookingsTable;

    @FXML
    public void initialize() {
        // Setup table columns here (Phase 8)
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
        if (selected == null) return;

        try {
            // Hardcoded time for demo; normally it would ideally be grabbed from DatePicker UI
            LocalDateTime start = LocalDateTime.now().plusDays(1);
            LocalDateTime end = start.plusHours(2);

            facade.createBooking(currentUserId, selected.getEquipmentID(), start, end);
            loadMyBookings();
            showAlert("Success", "Booking created. Status is PENDING.");
        } catch (Exception e) {
            showAlert("Error", e.getMessage());
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
            LocalDateTime newEnd = selected.getEndTime().plusHours(1);
            facade.extendBooking(selected.getBookingID(), newEnd);
            loadMyBookings();
        }
    }

    @FXML
    public void handleConfirmArrival() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            facade.confirmArrival(selected.getBookingID());
            loadMyBookings();
        }
    }

    @FXML
    public void handlePayment() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            // Using a dummy credit card strategy for Phase 7 implementation
            PaymentStrategy strategy = new CreditCardPayment("1234567890123456", "12/28", "123", "John Doe");
            boolean success = facade.processPayment(selected.getBookingID(), strategy);
            showAlert("Payment", success ? "Payment Successful" : "Payment Failed");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}