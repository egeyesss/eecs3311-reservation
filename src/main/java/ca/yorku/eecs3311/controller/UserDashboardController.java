package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceDialog;
import java.util.Optional;
import java.util.ArrayList;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.payment.*;
import ca.yorku.eecs3311.model.user.ResearchGrant;
import java.time.LocalDate;
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
        if (selected == null) {
            showAlert("Selection Error", "Please select a booking from the table to pay for.");
            return;
        }

        // Check if they already paid
        ca.yorku.eecs3311.model.payment.Payment existingPayment = facade.getPaymentReceipt(selected.getBookingID());
        if (existingPayment != null && "COMPLETED".equals(existingPayment.getStatus())) {
            showAlert("Already Paid", "This booking is already paid in full.\n" +
                    "Receipt ID: " + existingPayment.getTransactionID() + "\n" +
                    "Method: " + existingPayment.getPaymentMethod());
            return;
        }

        // Check booking state (Cannot pay for PENDING or CANCELLED)
        String status = selected.getStatus().name();
        if ("PENDING".equals(status) || "CONFIRMED".equals(status)) {
            showAlert("Payment Not Ready", "You can only pay your balance after you confirm arrival (ACTIVE state).");
            return;
        }
        if ("CANCELLED".equals(status)) {
            showAlert("Cancelled", "This booking was cancelled. No balance is due.");
            return;
        }

        // Identify User Role
        ca.yorku.eecs3311.model.user.User user = selected.getUser();
        UserType type = user.getUserType();

        // Build Dynamic Payment Options based on Role (Req 10)
        List<String> options = new ArrayList<>();
        options.add("Credit Card");
        options.add("Debit Card");

        if (type == UserType.FACULTY) {
            options.add("Institutional Account");
        } else if (type == UserType.RESEARCHER) {
            options.add("Research Grant");
        }

        // Launch the UI Dialog Box
        ChoiceDialog<String> dialog = new ChoiceDialog<>("Credit Card", options);
        dialog.setTitle("Select Payment Method");
        dialog.setHeaderText("Total Due: $" + String.format("%.2f", selected.getTotalCost()));
        dialog.setContentText("Choose your payment strategy:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(choice -> {
            PaymentStrategy strategy = null;

            // instantiate the correct paymentStrategy
            switch (choice) {
                case "Credit Card":
                    strategy = new CreditCardPayment("1234567890123456", "12/28", "123", user.getEmail());
                    break;
                case "Debit Card":
                    // Dummy balance of $500 for testing insufficient funds later
                    strategy = new DebitCardPayment("9876543210987654", "1234", user.getEmail(), 500.00);
                    break;
                case "Institutional Account":
                    // Mocking the institutional account for the demo
                    InstitutionalAccount acc = new InstitutionalAccount("ACC-123", user.getDepartment(), user.getUserId(), 1000.00);
                    strategy = new InstitutionalAccountPayment(acc);
                    break;
                case "Research Grant":
                    // Mocking the research grant for the demo
                    ResearchGrant grant = new ResearchGrant("GRANT-999", "Lab Funding", user.getUserId(), 5000.00, LocalDate.now().plusYears(1));
                    strategy = new ResearchGrantPayment(grant);
                    break;
            }

            // execute via Facade
            if (strategy != null) {
                boolean success = facade.processPayment(selected.getBookingID(), strategy);
                if (success) {
                    showAlert("Payment Successful", "Processed via " + choice + ".\n" + strategy.getPaymentDetails());
                } else {
                    showAlert("Payment Failed", "Insufficient funds or invalid payment details for " + choice + ".");
                }
            }
        });
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