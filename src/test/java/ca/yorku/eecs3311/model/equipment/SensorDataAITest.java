package ca.yorku.eecs3311.model.equipment;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SensorDataAITest {

    @Test
    void ai_constructorShouldStoreValuesCorrectly() {
        SensorData data = new SensorData("S100", "RUNNING", Map.of("errorRate", 0.01), 35.0, Duration.ofHours(2));

        assertNotNull(data.getDataID());
        assertEquals("S100", data.getSensorID());
        assertEquals("RUNNING", data.getOperationStatus());
        assertEquals(35.0, data.getTemperature());
        assertEquals(Duration.ofHours(2), data.getRunTime());
        assertNotNull(data.getTimestamp());
    }

    @Test
    void ai_isAbnormalShouldReturnTrueForHighTemperature() {
        SensorData data = new SensorData("S100", "RUNNING", Map.of("errorRate", 0.01), 100.0, Duration.ofHours(1));

        assertTrue(data.isAbnormal());
    }

    @Test
    void ai_isAbnormalShouldReturnTrueForLongRuntime() {
        SensorData data = new SensorData("S100", "RUNNING", Map.of("errorRate", 0.01), 30.0, Duration.ofHours(100));

        assertTrue(data.isAbnormal());
    }

    @Test
    void ai_isAbnormalShouldReturnTrueForHighErrorRate() {
        SensorData data = new SensorData("S100", "RUNNING", Map.of("errorRate", 0.5), 30.0, Duration.ofHours(1));

        assertTrue(data.isAbnormal());
    }

    @Test
    void ai_isAbnormalShouldReturnFalseForNormalValues() {
        SensorData data = new SensorData("S100", "RUNNING", Map.of("errorRate", 0.01), 30.0, Duration.ofHours(1));

        assertFalse(data.isAbnormal());
    }

    @Test
    void ai_isAbnormalShouldHandleNullUsageMetricsSafely() {
        SensorData data = new SensorData("S100", "RUNNING", null, 30.0, Duration.ofHours(1));

        assertFalse(data.isAbnormal());
    }
}