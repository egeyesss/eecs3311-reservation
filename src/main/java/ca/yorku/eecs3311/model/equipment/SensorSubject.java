package ca.yorku.eecs3311.model.equipment;

/**
 * Subject interface for sensor observer pattern.
 */
public interface SensorSubject {
	void register(SensorObserver o);
	void remove(SensorObserver o);
	void notifyObservers(SensorData data);
}

