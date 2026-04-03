package ca.yorku.eecs3311.model.equipment;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SensorAITest {

    private static class TestObserver implements SensorObserver {
        int updatesReceived = 0;
        SensorData lastData = null;

        @Override
        public void update(SensorData data) {
            updatesReceived++;
            lastData = data;
        }
    }

    @Test
    void ai_constructorShouldInitializeSensorFields() {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");

        assertEquals("S100", sensor.getSensorID());
        assertEquals("TEMP", sensor.getSensorType());
        assertEquals("E100", sensor.getEquipmentID());
        assertNotNull(sensor.getLastUpdate());
        assertNull(sensor.getLastData());
    }

    @Test
    void ai_registerShouldAddObserverAndAbnormalTrackUsageShouldNotify() {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");
        TestObserver observer = new TestObserver();
        sensor.register(observer);

        sensor.trackUsage(Map.of("errorRate", 0.2), 90.0, Duration.ofHours(80));

        assertEquals(1, observer.updatesReceived);
        assertNotNull(observer.lastData);
        assertTrue(observer.lastData.isAbnormal());
    }

    @Test
    void ai_registerShouldIgnoreNullObserver() {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");

        assertDoesNotThrow(() -> sensor.register(null));
    }

    @Test
    void ai_registerShouldNotDuplicateSameObserver() {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");
        TestObserver observer = new TestObserver();

        sensor.register(observer);
        sensor.register(observer);

        sensor.trackUsage(Map.of("errorRate", 0.2), 90.0, Duration.ofHours(80));

        assertEquals(1, observer.updatesReceived);
    }

    @Test
    void ai_removeShouldStopNotifications() {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");
        TestObserver observer = new TestObserver();

        sensor.register(observer);
        sensor.remove(observer);

        sensor.trackUsage(Map.of("errorRate", 0.2), 90.0, Duration.ofHours(80));

        assertEquals(0, observer.updatesReceived);
    }

    @Test
    void ai_normalDataShouldNotNotifyObservers() {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");
        TestObserver observer = new TestObserver();
        sensor.register(observer);

        sensor.trackUsage(Map.of("errorRate", 0.01), 30.0, Duration.ofHours(1));

        assertEquals(0, observer.updatesReceived);
    }

    @Test
    void ai_sendUpdateShouldStoreLastDataAndNotifyOnlyIfAbnormal() {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");
        TestObserver observer = new TestObserver();
        sensor.register(observer);

        SensorData data = new SensorData("S100", "RUNNING", Map.of("errorRate", 0.3), 95.0, Duration.ofHours(80));
        sensor.sendUpdate(data);

        assertEquals(data, sensor.getLastData());
        assertEquals(1, observer.updatesReceived);
    }

    @Test
    void ai_recordOperationStatusShouldStoreLastData() {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");

        SensorData data = sensor.recordOperationStatus("IDLE");

        assertEquals(data, sensor.getLastData());
        assertEquals("IDLE", data.getOperationStatus());
    }

    @Test
    void ai_calibrateShouldRefreshLastUpdate() throws InterruptedException {
        Sensor sensor = new Sensor("S100", "TEMP", "E100");
        LocalDateTime oldTime = sensor.getLastUpdate();

        Thread.sleep(5);
        sensor.calibrate();

        assertTrue(sensor.getLastUpdate().isAfter(oldTime));
    }
}