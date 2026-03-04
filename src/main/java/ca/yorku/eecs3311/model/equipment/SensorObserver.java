package ca.yorku.eecs3311.model.equipment;

/**
 * Observers implement this to receive sensor updates.
 */
public interface SensorObserver {
	void update(SensorData data);
}

