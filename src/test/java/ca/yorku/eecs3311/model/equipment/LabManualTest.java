package ca.yorku.eecs3311.model.equipment;

import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabManualTest {

    @Test
    void constructorShouldInitializeFieldsCorrectly() {
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);

        assertEquals("L1", lab.getLabID());
        assertEquals("Physics Lab", lab.getName());
        assertEquals("Petrie", lab.getBuilding());
        assertEquals("101", lab.getRoomNumber());
        assertEquals(20, lab.getCapacity());
        assertTrue(lab.getEquipmentList().isEmpty());
    }

    @Test
    void addEquipmentShouldAddEquipmentToList() {
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);
        Equipment equipment = new Equipment("E1", "Oscilloscope", "Signal tool", "ELEC", 30.0);

        lab.addEquipment(equipment);

        assertEquals(1, lab.getEquipmentList().size());
        assertEquals(equipment, lab.getEquipmentList().get(0));
    }

    @Test
    void addEquipmentShouldSetEquipmentLabReference() {
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);
        Equipment equipment = new Equipment("E1", "Oscilloscope", "Signal tool", "ELEC", 30.0);

        lab.addEquipment(equipment);

        assertEquals(lab, equipment.getLab());
    }

    @Test
    void addEquipmentShouldIgnoreNull() {
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);

        lab.addEquipment(null);

        assertTrue(lab.getEquipmentList().isEmpty());
    }

    @Test
    void addEquipmentShouldNotDuplicateEquipment() {
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);
        Equipment equipment = new Equipment("E1", "Oscilloscope", "Signal tool", "ELEC", 30.0);

        lab.addEquipment(equipment);
        lab.addEquipment(equipment);

        assertEquals(1, lab.getEquipmentList().size());
    }

    @Test
    void removeEquipmentShouldRemoveEquipmentFromList() {
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);
        Equipment equipment = new Equipment("E1", "Oscilloscope", "Signal tool", "ELEC", 30.0);
        lab.addEquipment(equipment);

        lab.removeEquipment(equipment);

        assertTrue(lab.getEquipmentList().isEmpty());
    }

    @Test
    void getAvailableEquipmentShouldReturnOnlyAvailableEquipment() {
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);

        Equipment e1 = new Equipment("E1", "Oscilloscope", "Signal tool", "ELEC", 30.0);
        Equipment e2 = new Equipment("E2", "Microscope", "Optical tool", "BIO", 20.0);
        e2.updateStatus(EquipmentStatus.UNDER_MAINTENANCE);

        lab.addEquipment(e1);
        lab.addEquipment(e2);

        assertEquals(1, lab.getAvailableEquipment().size());
        assertEquals("E1", lab.getAvailableEquipment().get(0).getEquipmentID());
    }

    @Test
    void getLabLocationShouldCombineBuildingAndRoom() {
        Lab lab = new Lab("L1", "Physics Lab", "Petrie", "101", 20);

        assertEquals("Petrie 101", lab.getLabLocation());
    }
}