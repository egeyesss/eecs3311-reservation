package ca.yorku.eecs3311.model.equipment;

import ca.yorku.eecs3311.model.enums.EquipmentStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipment {

	private String equipmentID;
	private String name;
	private String description;
	private String category;
	private EquipmentStatus status;
	private double hourlyRate;
	private String maintenanceNotes;
	private LocalDateTime lastMaintenanceDate;
	private List<Sensor> sensors;

	public Equipment(String equipmentID, String name, String description, String category, double hourlyRate) {
		this.equipmentID = equipmentID;
		this.name = name;
		this.description = description;
		this.category = category;
		this.hourlyRate = hourlyRate;
		this.status = EquipmentStatus.AVAILABLE;
		this.sensors = new ArrayList<>();
	}

	public boolean isAvailable() {
		return this.status == EquipmentStatus.AVAILABLE;
	}

	public void reserve() {
		this.status = EquipmentStatus.IN_USE;
	}

	public void release() {
		this.status = EquipmentStatus.AVAILABLE;
	}

	public void updateStatus(EquipmentStatus status) {
		this.status = status;
	}

	public List<String> getAvailableTimeSlots() {
		// Placeholder: real implementation would consult bookings
		if (!isAvailable()) return Collections.emptyList();
		List<String> slots = new ArrayList<>();
		slots.add("09:00-10:00");
		slots.add("10:00-11:00");
		return slots;
	}

	public List<SensorData> getSensorData() {
		List<SensorData> out = new ArrayList<>();
		for (Sensor s : sensors) {
			SensorData d = s.getLastData();
			if (d != null) out.add(d);
		}
		return out;
	}

	public void addSensor(Sensor sensor) {
		if (sensor == null) return;
		if (!sensors.contains(sensor)) sensors.add(sensor);
	}

	public void removeSensor(Sensor sensor) {
		sensors.remove(sensor);
	}

	// Getters / setters
	public String getEquipmentID() { return equipmentID; }
	public String getName() { return name; }
	public String getDescription() { return description; }
	public String getCategory() { return category; }
	public EquipmentStatus getStatus() { return status; }
	public double getHourlyRate() { return hourlyRate; }
	public String getMaintenanceNotes() { return maintenanceNotes; }
	public LocalDateTime getLastMaintenanceDate() { return lastMaintenanceDate; }
	public List<Sensor> getSensors() { return Collections.unmodifiableList(sensors); }

	public void setMaintenanceNotes(String maintenanceNotes) { this.maintenanceNotes = maintenanceNotes; }
	public void setLastMaintenanceDate(LocalDateTime lastMaintenanceDate) { this.lastMaintenanceDate = lastMaintenanceDate; }

	@Override
	public String toString() {
		return "Equipment{" + equipmentID + ", name=" + name + ", status=" + status + "}";
	}
}

