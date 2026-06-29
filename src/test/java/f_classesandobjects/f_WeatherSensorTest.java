package f_classesandobjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class f_WeatherSensorTest {
    @Test
    void averageTemp_basic() {
        f_WeatherSensor w = new f_WeatherSensor();
        w.record(10); w.record(14); w.record(16);
        assertEquals(40/3.0, w.averageTemp(), 0.001);
    }
} 