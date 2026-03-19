package ca.yorku.eecs3311;

import ca.yorku.eecs3311.dao.EquipmentDAO;
import ca.yorku.eecs3311.service.BookingManager;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Sensor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Initialize backend sensor monitoring at app startup --> implemented in req5
        initializeSensorMonitoring();

        // Load the initial login view
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);

        // CSS stylesheet
        scene.getStylesheets().add(getClass().getResource("/styles/app.css").toExternalForm());

        primaryStage.setTitle("YorkU Lab Equipment Reservation Platform");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initializeSensorMonitoring() {
        EquipmentDAO equipmentDAO = new EquipmentDAO();
        List<Equipment> equipmentList = equipmentDAO.loadAll();

        // Attach one sensor to each equipment at startup
        for (Equipment equipment : equipmentList) {
            if (equipment == null) {
                continue;
            }

            Sensor sensor = new Sensor(
                    "SENSOR_" + equipment.getEquipmentID(),
                    "TEMPERATURE",
                    equipment.getEquipmentID()
            );

            equipment.addSensor(sensor);
        }

        // Register backend observer to all sensors
        BookingManager.getInstance().registerToAllSensors(equipmentList);

        System.out.println("Sensor monitoring initialized for " + equipmentList.size() + " equipment items.");
    }

    public static void main(String[] args) {
        launch(args);
    }
}