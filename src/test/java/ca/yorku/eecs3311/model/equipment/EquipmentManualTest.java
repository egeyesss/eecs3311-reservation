package ca.yorku.eecs3311.model.equipment;

import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentManualTest {

    @Test
    void constructorShouldInitializeFieldsCorrectly() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);

        assertEquals("E001", equipment.getEquipmentID());
        assertEquals("Microscope", equipment.getName());
        assertEquals("Optical scope", equipment.getDescription());
        assertEquals("BIO", equipment.getCategory());
        assertEquals(25.0, equipment.getHourlyRate());
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
        assertTrue(equipment.getSensors().isEmpty());
        assertNull(equipment.getLabID());
        assertNull(equipment.getLab());
    }

    @Test
    void reserveShouldSetStatusToInUse() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);

        equipment.reserve();

        assertEquals(EquipmentStatus.IN_USE, equipment.getStatus());
        assertFalse(equipment.isAvailable());
    }

    @Test
    void releaseShouldSetStatusToAvailable() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);
        equipment.reserve();

        equipment.release();

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
        assertTrue(equipment.isAvailable());
    }

    @Test
    void updateStatusShouldChangeStatus() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);

        equipment.updateStatus(EquipmentStatus.UNDER_MAINTENANCE);

        assertEquals(EquipmentStatus.UNDER_MAINTENANCE, equipment.getStatus());
        assertFalse(equipment.isAvailable());
    }

    @Test
    void getAvailableTimeSlotsShouldReturnSlotsWhenAvailable() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);

        assertEquals(2, equipment.getAvailableTimeSlots().size());
        assertTrue(equipment.getAvailableTimeSlots().contains("09:00-10:00"));
        assertTrue(equipment.getAvailableTimeSlots().contains("10:00-11:00"));
    }

    @Test
    void getAvailableTimeSlotsShouldReturnEmptyWhenNotAvailable() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);
        equipment.updateStatus(EquipmentStatus.DISABLED);

        assertTrue(equipment.getAvailableTimeSlots().isEmpty());
    }

    @Test
    void addSensorShouldAddSensor() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);
        Sensor sensor = new Sensor("S1", "TEMP", "E001");

        equipment.addSensor(sensor);

        assertEquals(1, equipment.getSensors().size());
        assertEquals(sensor, equipment.getSensors().get(0));
    }

    @Test
    void addSensorShouldIgnoreNull() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);

        equipment.addSensor(null);

        assertTrue(equipment.getSensors().isEmpty());
    }

    @Test
    void addSensorShouldNotAddDuplicateSensor() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);
        Sensor sensor = new Sensor("S1", "TEMP", "E001");

        equipment.addSensor(sensor);
        equipment.addSensor(sensor);

        assertEquals(1, equipment.getSensors().size());
    }

    @Test
    void removeSensorShouldRemoveSensor() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);
        Sensor sensor = new Sensor("S1", "TEMP", "E001");
        equipment.addSensor(sensor);

        equipment.removeSensor(sensor);

        assertTrue(equipment.getSensors().isEmpty());
    }

    @Test
    void getSensorDataShouldReturnOnlyNonNullLastData() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);
        Sensor s1 = new Sensor("S1", "TEMP", "E001");
        Sensor s2 = new Sensor("S2", "TEMP", "E001");

        equipment.addSensor(s1);
        equipment.addSensor(s2);

        s1.trackUsage(Map.of("errorRate", 0.05), 50.0, Duration.ofHours(2));

        assertEquals(1, equipment.getSensorData().size());
        assertEquals("S1", equipment.getSensorData().get(0).getSensorID());
    }

    @Test
    void setLabShouldStoreLabReference() {
        Equipment equipment = new Equipment("E001", "Microscope", "Optical scope", "BIO", 25.0);
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);

        equipment.setLab(lab);

        assertEquals(lab, equipment.getLab());
    }
}