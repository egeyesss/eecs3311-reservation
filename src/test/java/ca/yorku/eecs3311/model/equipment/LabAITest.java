package ca.yorku.eecs3311.model.equipment;

import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabAITest {

    @Test
    void ai_constructorShouldInitializeFields() {
        Lab lab = new Lab("L100", "Chemistry Lab", "CB", "204", 40);

        assertEquals("L100", lab.getLabID());
        assertEquals("Chemistry Lab", lab.getName());
        assertEquals("CB", lab.getBuilding());
        assertEquals("204", lab.getRoomNumber());
        assertEquals(40, lab.getCapacity());
        assertTrue(lab.getEquipmentList().isEmpty());
    }

    @Test
    void ai_addEquipmentShouldAddEquipmentAndSetLabReference() {
        Lab lab = new Lab("L100", "Chemistry Lab", "CB", "204", 40);
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);

        lab.addEquipment(equipment);

        assertEquals(1, lab.getEquipmentList().size());
        assertEquals(lab, equipment.getLab());
    }

    @Test
    void ai_addEquipmentShouldIgnoreNull() {
        Lab lab = new Lab("L100", "Chemistry Lab", "CB", "204", 40);

        lab.addEquipment(null);

        assertTrue(lab.getEquipmentList().isEmpty());
    }

    @Test
    void ai_addEquipmentShouldNotDuplicateSameEquipment() {
        Lab lab = new Lab("L100", "Chemistry Lab", "CB", "204", 40);
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);

        lab.addEquipment(equipment);
        lab.addEquipment(equipment);

        assertEquals(1, lab.getEquipmentList().size());
    }

    @Test
    void ai_removeEquipmentShouldRemoveEquipmentFromLab() {
        Lab lab = new Lab("L100", "Chemistry Lab", "CB", "204", 40);
        Equipment equipment = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);
        lab.addEquipment(equipment);

        lab.removeEquipment(equipment);

        assertTrue(lab.getEquipmentList().isEmpty());
    }

    @Test
    void ai_getAvailableEquipmentShouldFilterOutUnavailableEquipment() {
        Lab lab = new Lab("L100", "Chemistry Lab", "CB", "204", 40);
        Equipment available = new Equipment("E100", "Centrifuge", "Lab centrifuge", "CHEM", 45.0);
        Equipment unavailable = new Equipment("E101", "Microscope", "Optical tool", "BIO", 20.0);
        unavailable.updateStatus(EquipmentStatus.UNDER_MAINTENANCE);

        lab.addEquipment(available);
        lab.addEquipment(unavailable);

        assertEquals(1, lab.getAvailableEquipment().size());
        assertEquals("E100", lab.getAvailableEquipment().get(0).getEquipmentID());
    }

    @Test
    void ai_getLabLocationShouldReturnBuildingAndRoomNumber() {
        Lab lab = new Lab("L100", "Chemistry Lab", "CB", "204", 40);

        assertEquals("CB 204", lab.getLabLocation());
    }
}