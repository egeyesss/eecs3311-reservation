package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Sensor;
import ca.yorku.eecs3311.model.equipment.SensorData;
import ca.yorku.eecs3311.model.equipment.SensorObserver;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import java.util.List;

public class ManagerDashboardController implements SensorObserver {

    private final BookingFacade facade = new BookingFacade();

    @FXML private TableView<Booking> bookingsTable;
    @FXML private TextField searchEquipmentField;

    @FXML
    public void initialize() {
        // Fetch all equipment to register this controller as an observer for their sensors
        List<Equipment> allEquipment = facade.getAllEquipment();
        for (Equipment eq : allEquipment) {
            for (Sensor sensor : eq.getSensors()) {
                sensor.register(this);
            }
        }
    }

    @FXML
    public void handleLoadBookings() {
        String equipId = searchEquipmentField.getText();
        if (equipId != null && !equipId.trim().isEmpty()) {
            loadAllBookings(equipId.trim());
        }
    }

    public void loadAllBookings(String equipmentID) {
        List<Booking> bookings = facade.getBookingsByEquipment(equipmentID);
        if (bookingsTable != null) {
            bookingsTable.setItems(FXCollections.observableArrayList(bookings));
        }
    }

    @FXML
    public void handleConfirmBooking() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            facade.confirmBooking(selected.getBookingID());
            loadAllBookings(selected.getEquipment().getEquipmentID());
        }
    }

    @FXML
    public void handleCancelBooking() {
        Booking selected = bookingsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            facade.cancelBooking(selected.getBookingID());
            loadAllBookings(selected.getEquipment().getEquipmentID());
        }
    }

    @FXML
    public void handleMaintenanceAlert(String equipmentID) {
        try {
            facade.updateEquipmentStatus(equipmentID, EquipmentStatus.UNDER_MAINTENANCE);
            showAlert("Maintenance Alert", "Equipment " + equipmentID + " has been marked as UNDER MAINTENANCE.");
        } catch (Exception e) {
            showAlert("Error", "Failed to update equipment status: " + e.getMessage());
        }
    }

    @Override
    public void update(SensorData data) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Equipment Alert");
            alert.setHeaderText("Abnormal Sensor Data Detected!");
            alert.setContentText("Sensor ID: " + data.getSensorID() +
                    "\nTemp: " + data.getTemperature() +
                    "\nStatus: " + data.getOperationStatus());
            alert.show();
        });
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}