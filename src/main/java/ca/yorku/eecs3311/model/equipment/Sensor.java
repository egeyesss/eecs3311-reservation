package ca.yorku.eecs3311.model.equipment;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Sensor implements SensorSubject {

	private final String sensorID;
	private final String sensorType;
	private final String equipmentID;
	private LocalDateTime lastUpdate;
	private final List<SensorObserver> observers = new ArrayList<>();
	private SensorData lastData;

	public Sensor(String sensorID, String sensorType, String equipmentID) {
		this.sensorID = sensorID;
		this.sensorType = sensorType;
		this.equipmentID = equipmentID;
		this.lastUpdate = LocalDateTime.now();
	}

	public SensorData trackUsage(Map<String, Double> usageMetrics, double temperature, Duration runTime) {
		SensorData data = new SensorData(sensorID, "USAGE", usageMetrics, temperature, runTime);
		this.lastData = data;
		this.lastUpdate = data.getTimestamp();
		notifyObservers(data);
		return data;
	}

	public SensorData recordOperationStatus(String status) {
		SensorData data = new SensorData(sensorID, status, Collections.emptyMap(), 0.0, Duration.ZERO);
		this.lastData = data;
		this.lastUpdate = data.getTimestamp();
		notifyObservers(data);
		return data;
	}

	public void sendUpdate(SensorData data) {
		this.lastData = data;
		this.lastUpdate = data.getTimestamp();
		notifyObservers(data);
	}

	public void calibrate() {
		this.lastUpdate = LocalDateTime.now();
	}

	@Override
	public synchronized void register(SensorObserver o) {
		if (o == null) return;
		if (!observers.contains(o)) observers.add(o);
	}

	@Override
	public synchronized void remove(SensorObserver o) {
		observers.remove(o);
	}

	@Override
	public synchronized void notifyObservers(SensorData data) {
		if (data == null) return;
		if (data.isAbnormal()) {
			for (SensorObserver o : new ArrayList<>(observers)) {
				try { o.update(data); } catch (Exception ignored) {}
			}
		}
	}

	public String getSensorID() { return sensorID; }
	public String getSensorType() { return sensorType; }
	public String getEquipmentID() { return equipmentID; }
	public LocalDateTime getLastUpdate() { return lastUpdate; }
	public SensorData getLastData() { return lastData; }

	@Override
	public String toString() {
		return "Sensor{" + sensorID + ", type=" + sensorType + ", eq=" + equipmentID + "}";
	}
}
