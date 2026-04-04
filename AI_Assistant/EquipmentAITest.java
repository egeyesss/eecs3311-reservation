package ca.yorku.eecs3311.model.equipment;

import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentAITest {

    @Test
    void ai_constructorShouldDefaultToAvailableAndNoSensors() {
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);

        assertEquals("E100", equipment.getEquipmentID());
        assertEquals("Centrifuge", equipment.getName());
        assertEquals("Lab centrifuge", equipment.getDescription());
        assertEquals("CHEM", equipment.getCategory());
        assertEquals(45.0, equipment.getHourlyRate());
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
        assertTrue(equipment.isAvailable());
        assertTrue(equipment.getSensors().isEmpty());
        assertNull(equipment.getLab());
    }

    @Test
    void ai_reserveAndReleaseShouldToggleAvailability() {
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);

        equipment.reserve();
        assertEquals(EquipmentStatus.IN_USE, equipment.getStatus());
        assertFalse(equipment.isAvailable());

        equipment.release();
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
        assertTrue(equipment.isAvailable());
    }

    @Test
    void ai_updateStatusShouldSupportMaintenance() {
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);

        equipment.updateStatus(EquipmentStatus.UNDER_MAINTENANCE);

        assertEquals(EquipmentStatus.UNDER_MAINTENANCE, equipment.getStatus());
        assertFalse(equipment.isAvailable());
    }

    @Test
    void ai_addSensorShouldIgnoreNullAndDuplicates() {
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);
        Sensor sensor = new Sensor("S100", "TEMP", "E100");

        equipment.addSensor(null);
        equipment.addSensor(sensor);
        equipment.addSensor(sensor);

        assertEquals(1, equipment.getSensors().size());
        assertEquals(sensor, equipment.getSensors().get(0));
    }

    @Test
    void ai_removeSensorShouldRemoveExistingSensor() {
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);
        Sensor sensor = new Sensor("S100", "TEMP", "E100");
        equipment.addSensor(sensor);

        equipment.removeSensor(sensor);

        assertTrue(equipment.getSensors().isEmpty());
    }

    @Test
    void ai_getSensorDataShouldReturnLatestDataOnlyForSensorsThatHaveData() {
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);
        Sensor s1 = new Sensor("S100", "TEMP", "E100");
        Sensor s2 = new Sensor("S101", "TEMP", "E100");

        equipment.addSensor(s1);
        equipment.addSensor(s2);

        s1.trackUsage(Map.of("errorRate", 0.02), 40.0, Duration.ofHours(1));

        assertEquals(1, equipment.getSensorData().size());
        assertEquals("S100", equipment.getSensorData().get(0).getSensorID());
    }

    @Test
    void ai_getAvailableTimeSlotsShouldReturnPlaceholderSlotsWhenAvailable() {
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);

        assertEquals(2, equipment.getAvailableTimeSlots().size());
        assertTrue(equipment.getAvailableTimeSlots().contains("09:00-10:00"));
        assertTrue(equipment.getAvailableTimeSlots().contains("10:00-11:00"));
    }

    @Test
    void ai_getAvailableTimeSlotsShouldReturnEmptyWhenUnavailable() {
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);
        equipment.updateStatus(EquipmentStatus.DISABLED);

        assertTrue(equipment.getAvailableTimeSlots().isEmpty());
    }
}