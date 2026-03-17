package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Sensor;
import ca.yorku.eecs3311.model.equipment.SensorData;
import ca.yorku.eecs3311.model.equipment.SensorObserver;
import ca.yorku.eecs3311.service.BookingFacade;
import ca.yorku.eecs3311.model.equipment.Lab;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class ManagerDashboardController implements SensorObserver {

    private final BookingFacade facade = new BookingFacade();

    // Equipment Tab Components
    @FXML private TableView<Equipment> equipmentTable;
    @FXML private TableColumn<Equipment, String> eqIdCol;
    @FXML private TableColumn<Equipment, String> eqNameCol;
    @FXML private TableColumn<Equipment, String> eqStatusCol;
    @FXML private TableColumn<Equipment, String> eqLabCol;
    @FXML private TableColumn<Equipment, Double> eqRateCol;

    // Booking Tab Components
    @FXML private TableView<Booking> bookingsTable;
    @FXML private TableColumn<Booking, String> mbIdCol;
    @FXML private TableColumn<Booking, String> mbUserCol;
    @FXML private TableColumn<Booking, String> mbEquipCol;
    @FXML private TableColumn<Booking, LocalDateTime> mbStartCol;
    @FXML private TableColumn<Booking, LocalDateTime> mbEndCol; // ADDED
    @FXML private TableColumn<Booking, String> mbStatusCol;

    @FXML
    public void initialize() {
        // --- Equipment Table Mapping ---
        eqIdCol.setCellValueFactory(new PropertyValueFactory<>("equipmentID"));
        eqNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        eqStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        eqLabCol.setCellValueFactory(cellData -> {
        Equipment eq = cellData.getValue();
        // Attempt to get the Lab object from the Equipment
        ca.yorku.eecs3311.model.equipment.Lab lab = eq.getLab(); // Adjust import if needed
        if (lab != null) {
        return new SimpleStringProperty(lab.getName());
        } else {
        // Fallback to the lab ID if the Lab object is missing
        return new SimpleStringProperty(eq.getLabID());
            }
        });

        eqRateCol.setCellValueFactory(new PropertyValueFactory<>("hourlyRate"));

        // --- Booking Table Mapping ---
        mbIdCol.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        mbUserCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getUser().getUserId()));
        mbEquipCol.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getEquipment().getName()));
        mbStartCol.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        mbEndCol.setCellValueFactory(new PropertyValueFactory<>("endTime")); // ADDED
        mbStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Load initial data
        loadAllEquipment();
        loadAllBookings();
        registerSensors();
    }

    // -------------------------------------------------------------------------
    // EQUIPMENT TAB LOGIC
    // -------------------------------------------------------------------------

    @FXML
    public void loadAllEquipment() {
        List<Equipment> all = facade.getAllEquipment();
        if (equipmentTable != null) {
            equipmentTable.setItems(FXCollections.observableArrayList(all));
        }
    }

    @FXML
    public void handleMarkUnderMaintenance() {
        Equipment selected = equipmentTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                facade.updateEquipmentStatus(selected.getEquipmentID(), EquipmentStatus.UNDER_MAINTENANCE);
                loadAllEquipment();
                showAlert("Success", "Equipment " + selected.getEquipmentID() + " is now UNDER MAINTENANCE.");
            } catch (Exception e) {
                showAlert("Error", e.getMessage());
            }
        }
    }

    @FXML
    public void handleMarkAvailable() {
        Equipment selected = equipmentTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                facade.markEquipmentAvailable(selected.getEquipmentID());
                loadAllEquipment();
                showAlert("Success", "Equipment " + selected.getEquipmentID() + " is now AVAILABLE.");
            } catch (Exception e) {
                showAlert("Error", e.getMessage());
            }
        }
    }

    @FXML
    public void handleAddEquipment() {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AddEquipment.fxml"));
        Parent root = loader.load();

        AddEquipmentController controller = loader.getController();
        controller.setOnSaveCallback(this::loadAllEquipment); // refresh table after save

        Stage stage = new Stage();
        stage.setTitle("Add Equipment");
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

    } catch (IOException e) {
        e.printStackTrace();
        showAlert("Error", "Could not open add equipment dialog.");
    }
}

    // -------------------------------------------------------------------------
    // BOOKING TAB LOGIC
    // -------------------------------------------------------------------------

    @FXML
    public void loadAllBookings() {
        List<Booking> allBookings = facade.getAllBookings();
        if (bookingsTable != null) {
            bookingsTable.setItems(FXCollections.observableArrayList(allBookings));
        }
    }

    @FXML
    public void handleConfirmBooking() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            facade.confirmBooking(selected.getBookingID());
            loadAllBookings();
        }
    }

    @FXML
    public void handleCancelBooking() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            facade.cancelBooking(selected.getBookingID());
            loadAllBookings();
        }
    }

    // -------------------------------------------------------------------------
    // SENSOR OBSERVER LOGIC
    // -------------------------------------------------------------------------

    private void registerSensors() {
        List<Equipment> allEquipment = facade.getAllEquipment();
        for (Equipment eq : allEquipment) {
            for (Sensor sensor : eq.getSensors()) {
                sensor.register(this);
            }
        }
    }

    @Override
    public void update(SensorData data) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Equipment Alert");
            alert.setHeaderText("Abnormal Sensor Data Detected!");
            alert.setContentText("Sensor ID: " + data.getSensorID() +
                    "\nTemp: " + data.getTemperature() + "C" +
                    "\nStatus: " + data.getOperationStatus());
            alert.show();
        });
    }

    @FXML
    public void handleLogout() {
        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("/view/login.fxml"));
            javafx.scene.Parent root = loader.load();
            javafx.stage.Stage stage = (javafx.stage.Stage) bookingsTable.getScene().getWindow();
            javafx.scene.Scene scene = new javafx.scene.Scene(root, 900, 650);
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
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void handleViewReceipt() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("Selection Error", "Please select a booking to view its receipt.");
            return;
        }

        ca.yorku.eecs3311.model.payment.Payment receipt = facade.getPaymentReceipt(selected.getBookingID());

        if (receipt == null) {
            showAlert("No Receipt", "No payment has been recorded for Booking ID:\n" + selected.getBookingID() +
                    "\n\nStatus: UNPAID");
        } else {
            showAlert("Payment Receipt",
                    "Transaction ID: " + receipt.getTransactionID() + "\n" +
                            "Date: " + receipt.getPaymentDate().toLocalDate() + "\n" +
                            "Method: " + receipt.getPaymentMethod() + "\n" +
                            "Amount Paid: $" + String.format("%.2f", receipt.getAmount()) + "\n" +
                            "Status: " + receipt.getStatus());
        }
    }
}