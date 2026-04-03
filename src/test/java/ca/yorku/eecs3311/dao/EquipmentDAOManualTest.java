package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Lab;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentDAOManualTest {

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
                        "E1,Oscilloscope,Signal tool,ELEC,AVAILABLE,30.0,,,L1\n" +
                        "E2,Microscope,Optical tool,BIO,UNDER_MAINTENANCE,20.0,Needs repair,,L2\n");

        Files.writeString(LAB_PATH,
                "labID,name,building,roomNumber,capacity\n" +
                        "L1,Electronics Lab,Bergeron,101,30\n" +
                        "L2,Biology Lab,Petrie,202,20\n");
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
    void loadAllShouldLoadEquipmentFromCsv() {
        EquipmentDAO dao = new EquipmentDAO();

        List<Equipment> equipmentList = dao.loadAll();

        assertEquals(2, equipmentList.size());
        assertEquals("E1", equipmentList.get(0).getEquipmentID());
        assertEquals("E2", equipmentList.get(1).getEquipmentID());
    }

    @Test
    void loadAllLabsShouldLoadLabsFromCsv() {
        EquipmentDAO dao = new EquipmentDAO();

        List<Lab> labs = dao.loadAllLabs();

        assertEquals(2, labs.size());
        assertEquals("L1", labs.get(0).getLabID());
        assertEquals("L2", labs.get(1).getLabID());
    }

    @Test
    void loadAllLabsWithEquipmentShouldAttachEquipmentToLabs() {
        EquipmentDAO dao = new EquipmentDAO();

        List<Lab> labs = dao.loadAllLabsWithEquipment();

        assertEquals(2, labs.size());
        assertEquals(1, labs.get(0).getEquipmentList().size());
        assertEquals("E1", labs.get(0).getEquipmentList().get(0).getEquipmentID());
    }

    @Test
    void findByIdShouldReturnMatchingEquipment() {
        EquipmentDAO dao = new EquipmentDAO();

        Equipment equipment = dao.findById("E1");

        assertNotNull(equipment);
        assertEquals("Oscilloscope", equipment.getName());
    }

    @Test
    void findByIdShouldReturnNullForMissingEquipment() {
        EquipmentDAO dao = new EquipmentDAO();

        Equipment equipment = dao.findById("DOES_NOT_EXIST");

        assertNull(equipment);
    }

    @Test
    void findByLabIdShouldReturnEquipmentForLab() {
        EquipmentDAO dao = new EquipmentDAO();

        List<Equipment> result = dao.findByLabId("L1");

        assertEquals(1, result.size());
        assertEquals("E1", result.get(0).getEquipmentID());
    }

    @Test
    void findLabByIdShouldReturnMatchingLab() {
        EquipmentDAO dao = new EquipmentDAO();

        Lab lab = dao.findLabById("L2");

        assertNotNull(lab);
        assertEquals("Biology Lab", lab.getName());
    }

    @Test
    void saveShouldAddNewEquipment() {
        EquipmentDAO dao = new EquipmentDAO();
        Equipment newEquipment = new Equipment("E3", "Printer", "3D printer", "MECH", 40.0);
        newEquipment.setLabID("L1");

        dao.save(newEquipment);

        Equipment loaded = dao.findById("E3");
        assertNotNull(loaded);
        assertEquals("Printer", loaded.getName());
    }

    @Test
    void saveShouldUpdateExistingEquipment() {
        EquipmentDAO dao = new EquipmentDAO();
        Equipment equipment = dao.findById("E1");
        assertNotNull(equipment);

        equipment.setMaintenanceNotes("Updated notes");
        dao.save(equipment);

        Equipment updated = dao.findById("E1");
        assertEquals("Updated notes", updated.getMaintenanceNotes());
    }

    @Test
    void updateStatusShouldChangeEquipmentStatus() {
        EquipmentDAO dao = new EquipmentDAO();

        dao.updateStatus("E1", EquipmentStatus.DISABLED);

        Equipment updated = dao.findById("E1");
        assertNotNull(updated);
        assertEquals(EquipmentStatus.DISABLED, updated.getStatus());
    }

    @Test
    void saveLabShouldAddNewLab() {
        EquipmentDAO dao = new EquipmentDAO();
        Lab newLab = new Lab("L3", "Chem Lab", "CB", "303", 25);

        dao.saveLab(newLab);

        Lab loaded = dao.findLabById("L3");
        assertNotNull(loaded);
        assertEquals("Chem Lab", loaded.getName());
    }

    @Test
    void loadAllShouldSkipMalformedRows() throws IOException {
        Files.writeString(EQUIPMENT_PATH,
                "equipmentID,name,description,category,status,hourlyRate,maintenanceNotes,lastMaintenanceDate,labID\n" +
                        "E1,Oscilloscope,Signal tool,ELEC,AVAILABLE,30.0,,,L1\n" +
                        "BADROW\n");

        EquipmentDAO dao = new EquipmentDAO();

        List<Equipment> equipmentList = dao.loadAll();

        assertEquals(1, equipmentList.size());
        assertEquals("E1", equipmentList.get(0).getEquipmentID());
    }
}