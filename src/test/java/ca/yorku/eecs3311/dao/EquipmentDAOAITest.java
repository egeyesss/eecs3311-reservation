package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Lab;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentDAOAITest {

    private static final Path EQUIPMENT_PATH = Path.of("src/main/resources/data/equipment.csv");
    private static final Path LAB_PATH = Path.of("src/main/resources/data/labs.csv");

    private String originalEquipmentCsv;
    private String originalLabsCsv;

    @BeforeEach
    void setUp() throws IOException {
        originalEquipmentCsv = Files.exists(EQUIPMENT_PATH) ? Files.readString(EQUIPMENT_PATH) : null;
        originalLabsCsv = Files.exists(LAB_PATH) ? Files.readString(LAB_PATH) : null;

        Files.createDirectories(EQUIPMENT_PATH.getParent());

        Files.writeString(EQUIPMENT_PATH,
                "equipmentID,name,description,category,status,hourlyRate,maintenanceNotes,lastMaintenanceDate,labID\n" +
                        "E100,Centrifuge,Lab centrifuge,CHEM,AVAILABLE,45.0,,,L100\n" +
                        "E101,Microscope,Optical tool,BIO,UNDER_MAINTENANCE,20.0,Needs cleaning,,L101\n");

        Files.writeString(LAB_PATH,
                "labID,name,building,roomNumber,capacity\n" +
                        "L100,Chem Lab,CB,204,40\n" +
                        "L101,Bio Lab,Petrie,101,20\n");
    }

    @AfterEach
    void tearDown() throws IOException {
        if (originalEquipmentCsv != null) {
            Files.writeString(EQUIPMENT_PATH, originalEquipmentCsv);
        } else {
            Files.deleteIfExists(EQUIPMENT_PATH);
        }

        if (originalLabsCsv != null) {
            Files.writeString(LAB_PATH, originalLabsCsv);
        } else {
            Files.deleteIfExists(LAB_PATH);
        }
    }

    @Test
    void ai_loadAllShouldLoadEquipmentRows() {
        EquipmentDAO dao = new EquipmentDAO();

        List<Equipment> equipmentList = dao.loadAll();

        assertEquals(2, equipmentList.size());
        assertEquals("E100", equipmentList.get(0).getEquipmentID());
        assertEquals("E101", equipmentList.get(1).getEquipmentID());
    }

    @Test
    void ai_loadAllLabsShouldLoadLabs() {
        EquipmentDAO dao = new EquipmentDAO();

        List<Lab> labs = dao.loadAllLabs();

        assertEquals(2, labs.size());
        assertEquals("L100", labs.get(0).getLabID());
    }

    @Test
    void ai_findByIdShouldReturnEquipmentWhenPresent() {
        EquipmentDAO dao = new EquipmentDAO();

        Equipment equipment = dao.findById("E100");

        assertNotNull(equipment);
        assertEquals("Centrifuge", equipment.getName());
    }

    @Test
    void ai_findByIdShouldReturnNullWhenMissing() {
        EquipmentDAO dao = new EquipmentDAO();

        assertNull(dao.findById("NOT_REAL"));
    }

    @Test
    void ai_findByLabIdShouldReturnEquipmentInThatLab() {
        EquipmentDAO dao = new EquipmentDAO();

        List<Equipment> result = dao.findByLabId("L100");

        assertEquals(1, result.size());
        assertEquals("E100", result.get(0).getEquipmentID());
    }

    @Test
    void ai_findLabByIdShouldReturnMatchingLab() {
        EquipmentDAO dao = new EquipmentDAO();

        Lab lab = dao.findLabById("L101");

        assertNotNull(lab);
        assertEquals("Bio Lab", lab.getName());
    }

    @Test
    void ai_saveShouldAddNewEquipmentRow() {
        EquipmentDAO dao = new EquipmentDAO();
        Equipment equipment = new Equipment("E102", "Printer", "3D printer", "MECH", 50.0);
        equipment.setLabID("L100");

        dao.save(equipment);

        Equipment loaded = dao.findById("E102");
        assertNotNull(loaded);
        assertEquals("Printer", loaded.getName());
    }

    @Test
    void ai_saveShouldUpdateExistingEquipment() {
        EquipmentDAO dao = new EquipmentDAO();
        Equipment equipment = dao.findById("E100");
        assertNotNull(equipment);

        equipment.setMaintenanceNotes("AI updated note");
        dao.save(equipment);

        Equipment updated = dao.findById("E100");
        assertEquals("AI updated note", updated.getMaintenanceNotes());
    }

    @Test
    void ai_updateStatusShouldChangeEquipmentStatus() {
        EquipmentDAO dao = new EquipmentDAO();

        dao.updateStatus("E100", EquipmentStatus.DISABLED);

        Equipment updated = dao.findById("E100");
        assertNotNull(updated);
        assertEquals(EquipmentStatus.DISABLED, updated.getStatus());
    }

    @Test
    void ai_loadAllLabsWithEquipmentShouldAttachEquipmentToLabs() {
        EquipmentDAO dao = new EquipmentDAO();

        List<Lab> labs = dao.loadAllLabsWithEquipment();

        assertEquals(2, labs.size());
        assertEquals(1, labs.get(0).getEquipmentList().size());
        assertEquals("E100", labs.get(0).getEquipmentList().get(0).getEquipmentID());
    }

    @Test
    void ai_saveLabShouldAddNewLab() {
        EquipmentDAO dao = new EquipmentDAO();
        Lab lab = new Lab("L102", "Physics Lab", "Bergeron", "320", 35);

        dao.saveLab(lab);

        Lab loaded = dao.findLabById("L102");
        assertNotNull(loaded);
        assertEquals("Physics Lab", loaded.getName());
    }
}