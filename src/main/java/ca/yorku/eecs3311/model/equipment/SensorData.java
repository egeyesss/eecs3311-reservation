package ca.yorku.eecs3311.model.equipment;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * Represents a single reading or event from a Sensor. Includes lightweight
 * heuristics to determine if the reading is abnormal.
 */
public class SensorData {

	private final String dataID;
	private final String sensorID;
	private final LocalDateTime timestamp;
	private final String operationStatus;
	private final Map<String, Double> usageMetrics;
	private final double temperature;
	private final Duration runTime;

	public SensorData(String sensorID, String operationStatus, Map<String, Double> usageMetrics,
					  double temperature, Duration runTime) {
		this.dataID = UUID.randomUUID().toString();
		this.sensorID = sensorID;
		this.timestamp = LocalDateTime.now();
		this.operationStatus = operationStatus;
		this.usageMetrics = usageMetrics;
		this.temperature = temperature;
		this.runTime = runTime;
	}

	public boolean isAbnormal() {
		if (temperature > 80.0) return true;
		if (runTime != null && runTime.toHours() > 72) return true;
		if (usageMetrics != null) {
			Double errorRate = usageMetrics.get("errorRate");
			if (errorRate != null && errorRate > 0.1) return true;
		}
		return false;
	}

	public String getDataID() { return dataID; }
	public String getSensorID() { return sensorID; }
	public LocalDateTime getTimestamp() { return timestamp; }
	public String getOperationStatus() { return operationStatus; }
	public Map<String, Double> getUsageMetrics() { return usageMetrics; }
	public double getTemperature() { return temperature; }
	public Duration getRunTime() { return runTime; }

	@Override
	public String toString() {
		return "SensorData{" + dataID + ", sensor=" + sensorID + ", ts=" + timestamp +
				", status=" + operationStatus + ", temp=" + temperature + "}";
	}
}

