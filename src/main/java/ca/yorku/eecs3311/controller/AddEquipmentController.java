package ca.yorku.eecs3311.controller;

import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Lab;
import ca.yorku.eecs3311.service.BookingFacade;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddEquipmentController {

    @FXML private TextField idField;
    @FXML private TextField nameField;
    @FXML private TextField descField;
    @FXML private TextField categoryField;
    @FXML private TextField rateField;
    @FXML private ComboBox<String> labCombo;

    private final BookingFacade facade = new BookingFacade();
    private Map<String, String> labIdMap; // maps lab name -> labID
    private Runnable onSaveCallback;      // to refresh the equipment table after save

    @FXML
    public void initialize() {
        // Load all labs from the facade
        List<Lab> labs = facade.getAllLabs();
        labIdMap = new HashMap<>();
        for (Lab lab : labs) {
            labIdMap.put(lab.getName(), lab.getLabID());
        }
        labCombo.setItems(FXCollections.observableArrayList(labIdMap.keySet()));
    }

    @FXML
    public void handleSave() {
        try {
            // Validate inputs (basic)
            String id = idField.getText().trim();
            String name = nameField.getText().trim();
            String desc = descField.getText().trim();
            String cat = categoryField.getText().trim();
            double rate = Double.parseDouble(rateField.getText().trim());
            String selectedLabName = labCombo.getValue();

            if (id.isEmpty() || name.isEmpty() || selectedLabName == null) {
                showAlert("Missing fields", "Please fill all required fields.");
                return;
            }

            String labID = labIdMap.get(selectedLabName);

            // Create equipment object (status defaults to AVAILABLE)
            Equipment eq = new Equipment(id, name, desc, cat, rate);
            eq.setLabID(labID);

            // Save via facade (you need to add a saveEquipment method)
            // For now, we'll assume you add a method in BookingFacade:
            facade.saveEquipment(eq);

            // Optionally, also add to lab's equipment list (if you want to maintain in‑memory)
            // This is not necessary for persistence but could be useful.
            // Lab lab = new Lab(); ... but we don't have the Lab object here.
            // Better: in facade.saveEquipment, you could load the lab and call lab.addEquipment(eq).

            closeDialog();
            if (onSaveCallback != null) onSaveCallback.run();

        } catch (NumberFormatException e) {
            showAlert("Invalid rate", "Hourly rate must be a number.");
        } catch (Exception e) {
            showAlert("Error", "Failed to save equipment: " + e.getMessage());
        }
    }

    @FXML
    public void handleCancel() {
        closeDialog();
    }

    private void closeDialog() {
        Stage stage = (Stage) labCombo.getScene().getWindow();
        stage.close();
    }

    private void showAlert(String title, String content) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void setOnSaveCallback(Runnable callback) {
        this.onSaveCallback = callback;
    }
}