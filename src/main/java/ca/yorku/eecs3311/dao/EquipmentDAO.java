package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Lab;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipmentDAO {

    private static final String EQUIPMENT_FILE = "src/main/resources/data/equipment.csv";
    private static final String LAB_FILE       = "src/main/resources/data/labs.csv";

    private static final String EQUIPMENT_HEADER =
            "equipmentID,name,description,category,status,hourlyRate,maintenanceNotes,lastMaintenanceDate,labID";
    private static final String LAB_HEADER =
            "labID,name,building,roomNumber,capacity";

    // CSV READ

    public List<Equipment> loadAll() {
        List<Equipment> list = new ArrayList<>();
        File file = new File(EQUIPMENT_FILE);
        if (!file.exists()) return list;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) { isHeader = false; continue; }
                line = line.trim();
                if (line.isEmpty()) continue;
                try {
                    list.add(parseEquipmentRow(line.split(",", -1)));
                } catch (Exception e) {
                    System.err.println("EquipmentDAO: skipping bad equipment row: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("EquipmentDAO: read error: " + e.getMessage());
        }
        return list;
    }

    public List<Lab> loadAllLabs() {
        List<Lab> list = new ArrayList<>();
        File file = new File(LAB_FILE);
        if (!file.exists()) return list;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) { isHeader = false; continue; }
                line = line.trim();
                if (line.isEmpty()) continue;
                try {
                    list.add(parseLabRow(line.split(",", -1)));
                } catch (Exception e) {
                    System.err.println("EquipmentDAO: skipping bad lab row: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("EquipmentDAO: lab read error: " + e.getMessage());
        }
        return list;
    }

    /** Loads all labs and attaches their equipment — use this in services. */
    public List<Lab> loadAllLabsWithEquipment() {
        List<Lab> labs = loadAllLabs();
        List<Equipment> equipment = loadAll();

        Map<String, Lab> labMap = new HashMap<>();
        for (Lab lab : labs) labMap.put(lab.getLabID(), lab);

        for (Equipment e : equipment) {
            if (e.getLabID() != null && labMap.containsKey(e.getLabID())) {
                labMap.get(e.getLabID()).addEquipment(e);
            }
        }
        return labs;
    }

    public Equipment findById(String equipmentID) {
        for (Equipment e : loadAll()) {
            if (e.getEquipmentID().equals(equipmentID)) return e;
        }
        return null;
    }

    public List<Equipment> findByLabId(String labID) {
        List<Equipment> result = new ArrayList<>();
        for (Equipment e : loadAll()) {
            if (labID.equals(e.getLabID())) result.add(e);
        }
        return result;
    }

    public Lab findLabById(String labID) {
    for (Lab lab : loadAllLabs()) {
        if (lab.getLabID().equals(labID)) return lab;
    }
    return null;
}

    // CSV WRITE

    public void save(Equipment equipment) {
        List<Equipment> all = loadAll();
        boolean updated = false;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getEquipmentID().equals(equipment.getEquipmentID())) {
                all.set(i, equipment);
                updated = true;
                break;
            }
        }
        if (!updated) all.add(equipment);
        writeAllEquipment(all);
    }

    public void updateStatus(String equipmentID, EquipmentStatus newStatus) {
        List<Equipment> all = loadAll();
        for (Equipment e : all) {
            if (e.getEquipmentID().equals(equipmentID)) {
                e.updateStatus(newStatus);
                break;
            }
        }
        writeAllEquipment(all);
    }

    public void saveLab(Lab lab) {
        List<Lab> all = loadAllLabs();
        boolean updated = false;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getLabID().equals(lab.getLabID())) {
                all.set(i, lab);
                updated = true;
                break;
            }
        }
        if (!updated) all.add(lab);
        writeAllLabs(all);
    }

    // HELPER METHODS / FUNCTIONS

    private Equipment parseEquipmentRow(String[] p) {
        if (p.length < 5) throw new IllegalArgumentException("Too few columns");
        String id           = p[0].trim();
        String name         = p[1].trim();
        String description  = p[2].trim();
        String category     = p[3].trim();
        EquipmentStatus st  = EquipmentStatus.valueOf(p[4].trim());
        double hourlyRate   = Double.parseDouble(p[5].trim());
        String maintNotes   = p.length > 6 ? p[6].trim() : "";
        String maintDate    = p.length > 7 ? p[7].trim() : "";
        String labID        = p.length > 8 ? p[8].trim() : "";

        Equipment e = new Equipment(id, name, description, category, hourlyRate);
        e.updateStatus(st);
        if (!maintNotes.isEmpty()) e.setMaintenanceNotes(maintNotes);
        if (!maintDate.isEmpty())  e.setLastMaintenanceDate(LocalDateTime.parse(maintDate));
        e.setLabID(labID);
        return e;
    }

    private Lab parseLabRow(String[] p) {
        if (p.length < 5) throw new IllegalArgumentException("Too few columns");
        String labID    = p[0].trim();
        String name     = p[1].trim();
        String building = p[2].trim();
        String room     = p[3].trim();
        int capacity    = Integer.parseInt(p[4].trim());
        return new Lab(labID, name, building, room, capacity);
    }

    private String equipmentToRow(Equipment e) {
        return String.join(",",
                e.getEquipmentID(), e.getName(), e.getDescription(), e.getCategory(),
                e.getStatus().name(), String.valueOf(e.getHourlyRate()),
                e.getMaintenanceNotes() != null ? e.getMaintenanceNotes() : "",
                e.getLastMaintenanceDate() != null ? e.getLastMaintenanceDate().toString() : "",
                e.getLabID() != null ? e.getLabID() : "");
    }

    private String labToRow(Lab l) {
        return String.join(",",
                l.getLabID(), l.getName(), l.getBuilding(),
                l.getRoomNumber(), String.valueOf(l.getCapacity()));
    }

    public void writeAllEquipment(List<Equipment> equipment) {
        File file = new File(EQUIPMENT_FILE);
        file.getParentFile().mkdirs();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(EQUIPMENT_HEADER);
            writer.newLine();
            for (Equipment e : equipment) {
                writer.write(equipmentToRow(e));
                writer.newLine();
            }
        } catch (IOException ex) {
            System.err.println("EquipmentDAO: write error: " + ex.getMessage());
        }
    }

    private void writeAllLabs(List<Lab> labs) {
        File file = new File(LAB_FILE);
        file.getParentFile().mkdirs();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(LAB_HEADER);
            writer.newLine();
            for (Lab l : labs) {
                writer.write(labToRow(l));
                writer.newLine();
            }
        } catch (IOException ex) {
            System.err.println("EquipmentDAO: lab write error: " + ex.getMessage());
        }
    }
}