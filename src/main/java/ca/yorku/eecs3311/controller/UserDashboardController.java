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
import java.time.format.DateTimeFormatter;
import javafx.scene.control.TableCell;

import java.time.LocalDateTime;
import java.util.List;

public class UserDashboardController {

    private final BookingFacade facade = new BookingFacade();
    private String currentUserId;

    @FXML private TableView<Equipment> equipmentTable;
    @FXML private TableColumn<Equipment, String> eqIdCol;
    @FXML private TableColumn<Equipment, String> eqNameCol;
    @FXML private TableColumn<Equipment, String> eqCatCol;
    @FXML private TableColumn<Equipment, String> eqLabCol;
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
        eqLabCol.setCellValueFactory(cellData -> {
            Equipment eq = cellData.getValue();
            ca.yorku.eecs3311.model.equipment.Lab lab = eq.getLab();
            if (lab != null) {
                // format of location: Building, RoomNumber
                return new javafx.beans.property.SimpleStringProperty(lab.getBuilding() + ", " + lab.getRoomNumber());
            } else {
                // fallback, error handling
                return new javafx.beans.property.SimpleStringProperty(eq.getLabID());
            }
        });

        // Bookings Table Mapping
        bIdCol.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        // Custom lambda to show Equipment Name instead of the whole object
        bEquipCol.setCellValueFactory(cellData ->
                new javafx.beans.property.SimpleStringProperty(cellData.getValue().getEquipment().getName()));
        bStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        bCostCol.setCellValueFactory(new PropertyValueFactory<>("totalCost"));

        // formatted date columns
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");

        bStartCol.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        bStartCol.setCellFactory(column -> new javafx.scene.control.TableCell<Booking, LocalDateTime>() {
            @Override
            protected void updateItem(LocalDateTime item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(formatter.format(item));
                }
            }
        });

        bEndCol.setCellValueFactory(new PropertyValueFactory<>("endTime"));
        bEndCol.setCellFactory(column -> new javafx.scene.control.TableCell<Booking, LocalDateTime>() {
            @Override
            protected void updateItem(LocalDateTime item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(formatter.format(item));
                }
            }
        });
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

        // Create the Time Slot Dialog
        javafx.scene.control.Dialog<javafx.scene.control.ButtonType> dialog = new javafx.scene.control.Dialog<>();
        dialog.setTitle("Create Booking");
        dialog.setHeaderText("Select date and time.\n(Must start at least 1 hr from now. Max duration: 4 hrs)");

        javafx.scene.control.ButtonType bookButtonType = new javafx.scene.control.ButtonType("Book Equipment", javafx.scene.control.ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(bookButtonType, javafx.scene.control.ButtonType.CANCEL);

        javafx.scene.layout.GridPane grid = new javafx.scene.layout.GridPane();
        grid.setHgap(10); grid.setVgap(10);
        grid.setPadding(new javafx.geometry.Insets(20, 150, 10, 10));

        javafx.scene.control.DatePicker datePicker = new javafx.scene.control.DatePicker(java.time.LocalDate.now());
        javafx.scene.control.ComboBox<String> startCombo = new javafx.scene.control.ComboBox<>();
        javafx.scene.control.ComboBox<String> endCombo = new javafx.scene.control.ComboBox<>();

        for (int i = 8; i <= 22; i++) {
            String timeStr = String.format("%02d:00", i);
            startCombo.getItems().add(timeStr);
            endCombo.getItems().add(timeStr);
        }

        // Defaults: Start 1 hour from now, end 2 hours from now
        int nextHour = LocalDateTime.now().plusHours(1).getHour();
        if (nextHour >= 8 && nextHour <= 22) {
            startCombo.setValue(String.format("%02d:00", nextHour));
            endCombo.setValue(String.format("%02d:00", Math.min(22, nextHour + 1)));
        }

        grid.add(new javafx.scene.control.Label("Date:"), 0, 0);
        grid.add(datePicker, 1, 0);
        grid.add(new javafx.scene.control.Label("Start Time:"), 0, 1);
        grid.add(startCombo, 1, 1);
        grid.add(new javafx.scene.control.Label("End Time:"), 0, 2);
        grid.add(endCombo, 1, 2);

        dialog.getDialogPane().setContent(grid);

        java.util.Optional<javafx.scene.control.ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == bookButtonType) {
            try {
                if (startCombo.getValue() == null || endCombo.getValue() == null) {
                    showAlert("Input Error", "Please select both start and end times.");
                    return;
                }

                java.time.LocalDate date = datePicker.getValue();
                java.time.LocalTime startTime = java.time.LocalTime.parse(startCombo.getValue());
                java.time.LocalTime endTime = java.time.LocalTime.parse(endCombo.getValue());

                LocalDateTime start = LocalDateTime.of(date, startTime);
                LocalDateTime end = LocalDateTime.of(date, endTime);

                if (!end.isAfter(start)) {
                    showAlert("Invalid Time", "End time must be after the start time.");
                    return;
                }

                // Call facade (the backend will enforce the 1-hr advance and 4-hr max rules)
                Booking newBooking = facade.createBooking(currentUserId, selected.getEquipmentID(), start, end);

                // Req 4: immediately require deposit to confirm
                boolean depositPaid = showDepositPaymentDialog(newBooking);
                if (!depositPaid) {
                    // User declined deposit — cancel the booking
                    facade.cancelBooking(newBooking.getBookingID());
                    showAlert("Booking Cancelled", "Deposit was not paid. Your booking has been cancelled.");
                } else {
                    showAlert("Booking Confirmed", "Deposit paid! Your booking is now CONFIRMED.");
                }

                loadMyBookings();
                loadAvailableEquipment();

            } catch (IllegalStateException e) {
                showAlert("Action Denied", e.getMessage());
            } catch (Exception e) {
                showAlert("Error", "An unexpected error occurred: " + e.getMessage());
            }
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
                // UI Guard for 4-hour max
                if (selected.getDuration().toHours() >= 4) {
                    showAlert("Action Denied", "Cannot extend: Maximum booking duration of 4 hours has been reached.");
                    return;
                }

                LocalDateTime newEnd = selected.getEndTime().plusHours(1);
                facade.extendBooking(selected.getBookingID(), newEnd);
                loadMyBookings();
                showAlert("Success", "Booking extended by 1 hour.");
            } catch (IllegalStateException e) {
                showAlert("Action Denied", e.getMessage());
            }
        }
    }

    @FXML
    public void handleModifyBooking() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("Selection Error", "Please select a booking to modify.");
            return;
        }

        // Restored UI guard: Prevent modifying if already started
        if (LocalDateTime.now().isAfter(selected.getStartTime()) || LocalDateTime.now().isEqual(selected.getStartTime())) {
            showAlert("Action Denied", "Cannot modify a booking after its scheduled start time.");
            return;
        }

        javafx.scene.control.Dialog<javafx.scene.control.ButtonType> dialog = new javafx.scene.control.Dialog<>();
        dialog.setTitle("Modify Booking Time");
        dialog.setHeaderText("Select a new date and time.\n(Max duration: 4 hrs)");

        javafx.scene.control.ButtonType saveButtonType = new javafx.scene.control.ButtonType("Save Changes", javafx.scene.control.ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(saveButtonType, javafx.scene.control.ButtonType.CANCEL);

        javafx.scene.layout.GridPane grid = new javafx.scene.layout.GridPane();
        grid.setHgap(10); grid.setVgap(10);
        grid.setPadding(new javafx.geometry.Insets(20, 150, 10, 10));

        javafx.scene.control.DatePicker datePicker = new javafx.scene.control.DatePicker(selected.getStartTime().toLocalDate());
        javafx.scene.control.ComboBox<String> startCombo = new javafx.scene.control.ComboBox<>();
        javafx.scene.control.ComboBox<String> endCombo = new javafx.scene.control.ComboBox<>();

        for (int i = 8; i <= 22; i++) {
            String timeStr = String.format("%02d:00", i);
            startCombo.getItems().add(timeStr);
            endCombo.getItems().add(timeStr);
        }

        startCombo.setValue(String.format("%02d:00", selected.getStartTime().getHour()));
        endCombo.setValue(String.format("%02d:00", selected.getEndTime().getHour()));

        grid.add(new javafx.scene.control.Label("New Date:"), 0, 0);
        grid.add(datePicker, 1, 0);
        grid.add(new javafx.scene.control.Label("Start Time:"), 0, 1);
        grid.add(startCombo, 1, 1);
        grid.add(new javafx.scene.control.Label("End Time:"), 0, 2);
        grid.add(endCombo, 1, 2);

        dialog.getDialogPane().setContent(grid);

        java.util.Optional<javafx.scene.control.ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == saveButtonType) {
            try {
                java.time.LocalDate date = datePicker.getValue();
                java.time.LocalTime startTime = java.time.LocalTime.parse(startCombo.getValue());
                java.time.LocalTime endTime = java.time.LocalTime.parse(endCombo.getValue());

                LocalDateTime newStart = LocalDateTime.of(date, startTime);
                LocalDateTime newEnd = LocalDateTime.of(date, endTime);

                if (!newEnd.isAfter(newStart)) {
                    showAlert("Invalid Time", "End time must be after the start time.");
                    return;
                }

                facade.modifyBooking(selected.getBookingID(), newStart, newEnd);
                loadMyBookings();
                showAlert("Success", "Booking times successfully modified!");

            } catch (IllegalStateException e) {
                showAlert("Action Denied", e.getMessage());
            } catch (Exception e) {
                showAlert("Error", "Failed to modify booking: " + e.getMessage());
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
                // Covers: before start time, window expired (auto-cancelled), wrong state
                loadMyBookings();
                loadAvailableEquipment();
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

        String status = selected.getStatus().name();

        if ("CANCELLED".equals(status)) {
            showAlert("Cancelled", "This booking was cancelled. No balance is due.");
            return;
        }

        if ("CONFIRMED".equals(status)) {
            showAlert("Payment Not Ready", "Deposit already paid. Confirm your arrival to proceed.");
            return;
        }

        if ("PENDING".equals(status)) {
            // Req 4: charge deposit to confirm the booking
            boolean paid = showDepositPaymentDialog(selected);
            if (paid) {
                loadMyBookings();
                loadAvailableEquipment();
            }
            return;
        }

        // ACTIVE or COMPLETED: check if balance already paid
        ca.yorku.eecs3311.model.payment.Payment existingPayment = facade.getPaymentReceipt(selected.getBookingID());
        if (existingPayment != null && "COMPLETED".equals(existingPayment.getStatus())) {
            showAlert("Already Paid", "This booking is already paid in full.\n" +
                    "Receipt ID: " + existingPayment.getTransactionID() + "\n" +
                    "Method: " + existingPayment.getPaymentMethod());
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

        double remainingBalance = selected.getTotalCost() - selected.getDepositPaid();

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Credit Card", options);
        dialog.setTitle("Pay Balance");
        dialog.setHeaderText("Balance Due: $" + String.format("%.2f", remainingBalance) +
                " (Total: $" + String.format("%.2f", selected.getTotalCost()) +
                " - Deposit: $" + String.format("%.2f", selected.getDepositPaid()) + ")");
        dialog.setContentText("Choose your payment method:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(choice -> {
            PaymentStrategy strategy = null;
            switch (choice) {
                case "Credit Card":
                    strategy = new CreditCardPayment("1234567890123456", "12/28", "123", user.getEmail());
                    break;
                case "Debit Card":
                    strategy = new DebitCardPayment("9876543210987654", "1234", user.getEmail(), 500.00);
                    break;
                case "Institutional Account":
                    InstitutionalAccount acc = new InstitutionalAccount("ACC-123", user.getDepartment(), user.getUserId(), 1000.00);
                    strategy = new InstitutionalAccountPayment(acc);
                    break;
                case "Research Grant":
                    ResearchGrant grant = new ResearchGrant("GRANT-999", "Lab Funding", user.getUserId(), 5000.00, LocalDate.now().plusYears(1));
                    strategy = new ResearchGrantPayment(grant);
                    break;
            }

            if (strategy != null) {
                boolean success = facade.processPayment(selected.getBookingID(), strategy);
                if (success) {
                    loadMyBookings();
                    showAlert("Payment Successful", "Processed via " + choice + ".\n" + strategy.getPaymentDetails());
                } else {
                    showAlert("Payment Failed", "Insufficient funds or invalid payment details for " + choice + ".");
                }
            }
        });
    }

    /**
     * Req 4: Shows a deposit payment dialog immediately after booking creation.
     * Returns true if deposit was successfully paid, false if cancelled.
     */
    private boolean showDepositPaymentDialog(Booking booking) {
        ca.yorku.eecs3311.model.user.User user = booking.getUser();
        ca.yorku.eecs3311.model.enums.UserType type = user.getUserType();
        double depositAmount = booking.getDepositAmount();

        List<String> options = new ArrayList<>();
        options.add("Credit Card");
        options.add("Debit Card");
        if (type == ca.yorku.eecs3311.model.enums.UserType.FACULTY) {
            options.add("Institutional Account");
        } else if (type == ca.yorku.eecs3311.model.enums.UserType.RESEARCHER) {
            options.add("Research Grant");
        }

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Credit Card", options);
        dialog.setTitle("Deposit Required");
        dialog.setHeaderText("A deposit of $" + String.format("%.2f", depositAmount) +
                " is required to confirm your booking.\nThis will be deducted from your total if you arrive on time.");
        dialog.setContentText("Choose your payment method:");

        Optional<String> result = dialog.showAndWait();
        if (!result.isPresent()) return false;

        String choice = result.get();
        ca.yorku.eecs3311.model.payment.PaymentStrategy strategy = null;
        switch (choice) {
            case "Credit Card":
                strategy = new ca.yorku.eecs3311.model.payment.CreditCardPayment("1234567890123456", "12/28", "123", user.getEmail());
                break;
            case "Debit Card":
                strategy = new ca.yorku.eecs3311.model.payment.DebitCardPayment("9876543210987654", "1234", user.getEmail(), 500.00);
                break;
            case "Institutional Account":
                ca.yorku.eecs3311.model.payment.InstitutionalAccount acc =
                        new ca.yorku.eecs3311.model.payment.InstitutionalAccount("ACC-123", user.getDepartment(), user.getUserId(), 1000.00);
                strategy = new ca.yorku.eecs3311.model.payment.InstitutionalAccountPayment(acc);
                break;
            case "Research Grant":
                ca.yorku.eecs3311.model.user.ResearchGrant grant =
                        new ca.yorku.eecs3311.model.user.ResearchGrant("GRANT-999", "Lab Funding", user.getUserId(), 5000.00, LocalDate.now().plusYears(1));
                strategy = new ca.yorku.eecs3311.model.payment.ResearchGrantPayment(grant);
                break;
        }

        if (strategy == null) return false;

        try {
            boolean paid = facade.processDeposit(booking.getBookingID(), strategy);
            if (!paid) {
                showAlert("Deposit Failed", "Insufficient funds or invalid payment details. Booking will be cancelled.");
            }
            return paid;
        } catch (Exception e) {
            showAlert("Deposit Error", e.getMessage());
            return false;
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