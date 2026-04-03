package ca.yorku.eecs3311.model.equipment;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SensorManualTest {

    private static class TestObserver implements SensorObserver {
        private int updateCount = 0;
        private SensorData lastData = null;

        @Override
        public void update(SensorData data) {
            updateCount++;
            lastData = data;
        }
    }

    @Test
    void constructorShouldInitializeFields() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");

        assertEquals("S1", sensor.getSensorID());
        assertEquals("TEMP", sensor.getSensorType());
        assertEquals("E1", sensor.getEquipmentID());
        assertNotNull(sensor.getLastUpdate());
        assertNull(sensor.getLastData());
    }

    @Test
    void trackUsageShouldStoreDataAndUpdateLastUpdate() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");

        SensorData data = sensor.trackUsage(Map.of("errorRate", 0.01), 45.0, Duration.ofHours(2));

        assertEquals(data, sensor.getLastData());
        assertNotNull(sensor.getLastUpdate());
    }

    @Test
    void recordOperationStatusShouldStoreData() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");

        SensorData data = sensor.recordOperationStatus("RUNNING");

        assertEquals(data, sensor.getLastData());
        assertEquals("RUNNING", data.getOperationStatus());
    }

    @Test
    void sendUpdateShouldStoreData() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        SensorData data = new SensorData("S1", "RUNNING", Map.of("errorRate", 0.01), 45.0, Duration.ofHours(2));

        sensor.sendUpdate(data);

        assertEquals(data, sensor.getLastData());
    }

    @Test
    void calibrateShouldUpdateLastUpdateTime() throws InterruptedException {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        LocalDateTime before = sensor.getLastUpdate();

        Thread.sleep(5);
        sensor.calibrate();

        assertTrue(sensor.getLastUpdate().isAfter(before));
    }

    @Test
    void registerShouldAddObserver() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        TestObserver observer = new TestObserver();

        sensor.register(observer);
        sensor.trackUsage(Map.of("errorRate", 0.5), 90.0, Duration.ofHours(80));

        assertEquals(1, observer.updateCount);
        assertNotNull(observer.lastData);
    }

    @Test
    void registerShouldIgnoreNullObserver() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");

        assertDoesNotThrow(() -> sensor.register(null));
    }

    @Test
    void registerShouldNotAddDuplicateObserverTwice() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        TestObserver observer = new TestObserver();

        sensor.register(observer);
        sensor.register(observer);

        sensor.trackUsage(Map.of("errorRate", 0.5), 90.0, Duration.ofHours(80));

        assertEquals(1, observer.updateCount);
    }

    @Test
    void removeShouldStopObserverFromReceivingUpdates() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        TestObserver observer = new TestObserver();

        sensor.register(observer);
        sensor.remove(observer);

        sensor.trackUsage(Map.of("errorRate", 0.5), 90.0, Duration.ofHours(80));

        assertEquals(0, observer.updateCount);
    }

    @Test
    void notifyObserversShouldOnlyNotifyForAbnormalData() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        TestObserver observer = new TestObserver();
        sensor.register(observer);

        sensor.trackUsage(Map.of("errorRate", 0.01), 45.0, Duration.ofHours(2));

        assertEquals(0, observer.updateCount);
    }

    @Test
    void notifyObserversShouldNotifyForAbnormalData() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        TestObserver observer = new TestObserver();
        sensor.register(observer);

        sensor.trackUsage(Map.of("errorRate", 0.2), 90.0, Duration.ofHours(80));

        assertEquals(1, observer.updateCount);
        assertNotNull(observer.lastData);
        assertTrue(observer.lastData.isAbnormal());
    }

    @Test
    void sendUpdateShouldNotifyForAbnormalData() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        TestObserver observer = new TestObserver();
        sensor.register(observer);

        SensorData abnormalData = new SensorData("S1", "RUNNING", Map.of("errorRate", 0.2), 90.0, Duration.ofHours(80));
        sensor.sendUpdate(abnormalData);

        assertEquals(1, observer.updateCount);
    }

    @Test
    void sendUpdateShouldNotNotifyForNormalData() {
        Sensor sensor = new Sensor("S1", "TEMP", "E1");
        TestObserver observer = new TestObserver();
        sensor.register(observer);

        SensorData normalData = new SensorData("S1", "RUNNING", Map.of("errorRate", 0.01), 40.0, Duration.ofHours(2));
        sensor.sendUpdate(normalData);

        assertEquals(0, observer.updateCount);
    }
}