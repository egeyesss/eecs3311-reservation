package ca.yorku.eecs3311.model.equipment;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SensorDataManualTest {

    @Test
    void constructorShouldInitializeFields() {
        SensorData data = new SensorData("S1", "RUNNING", Map.of("errorRate", 0.01), 45.0, Duration.ofHours(2));

        assertNotNull(data.getDataID());
        assertEquals("S1", data.getSensorID());
        assertEquals("RUNNING", data.getOperationStatus());
        assertEquals(45.0, data.getTemperature());
        assertEquals(Duration.ofHours(2), data.getRunTime());
        assertNotNull(data.getTimestamp());
    }

    @Test
    void isAbnormalShouldReturnTrueForHighTemperature() {
        SensorData data = new SensorData("S1", "RUNNING", Map.of("errorRate", 0.01), 85.0, Duration.ofHours(2));

        assertTrue(data.isAbnormal());
    }

    @Test
    void isAbnormalShouldReturnTrueForLongRuntime() {
        SensorData data = new SensorData("S1", "RUNNING", Map.of("errorRate", 0.01), 45.0, Duration.ofHours(80));

        assertTrue(data.isAbnormal());
    }

    @Test
    void isAbnormalShouldReturnTrueForHighErrorRate() {
        SensorData data = new SensorData("S1", "RUNNING", Map.of("errorRate", 0.2), 45.0, Duration.ofHours(2));

        assertTrue(data.isAbnormal());
    }

    @Test
    void isAbnormalShouldReturnFalseForNormalData() {
        SensorData data = new SensorData("S1", "RUNNING", Map.of("errorRate", 0.01), 45.0, Duration.ofHours(2));

        assertFalse(data.isAbnormal());
    }

    @Test
    void isAbnormalShouldHandleNullUsageMetrics() {
        SensorData data = new SensorData("S1", "RUNNING", null, 45.0, Duration.ofHours(2));

        assertFalse(data.isAbnormal());
    }
}