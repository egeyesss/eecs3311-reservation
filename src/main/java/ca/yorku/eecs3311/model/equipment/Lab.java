package ca.yorku.eecs3311.model.equipment;

import java.util.ArrayList;
import java.util.List;

public class Lab {

	private String labID;
	private String name;
	private String building;
	private String roomNumber;
	private int capacity;
	private List<Equipment> equipmentList;

	public Lab(String labID, String name, String building, String roomNumber, int capacity) {
		this.labID = labID;
		this.name = name;
		this.building = building;
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.equipmentList = new ArrayList<>();
	}

	public void addEquipment(Equipment e) {
		if (e == null) return;
		if (!equipmentList.contains(e)) 
			equipmentList.add(e);
			e.setLab(this);
	}

	public void removeEquipment(Equipment e) {
		equipmentList.remove(e);
	}

	public List<Equipment> getAvailableEquipment() {
		List<Equipment> out = new ArrayList<>();
		for (Equipment e : equipmentList) if (e.isAvailable()) out.add(e);
		return out;
	}

	public String getLabLocation() {
		return building + " " + roomNumber;
	}

	// Getters / setters
	public String getLabID() { return labID; }
	public String getName() { return name; }
	public String getBuilding() { return building; }
	public String getRoomNumber() { return roomNumber; }
	public int getCapacity() { return capacity; }
	public List<Equipment> getEquipmentList() { return equipmentList; }

	@Override
	public String toString() {
		return "Lab{" + labID + ", " + name + ", " + getLabLocation() + "}";
	}
}

