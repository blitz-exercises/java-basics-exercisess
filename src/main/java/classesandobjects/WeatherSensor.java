package classesandobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Weather Sensor
 * 
 * <p>A weather station has a sensor that records temperature readings throughout the day.
 * The sensor stores each hourly reading and can calculate the average temperature for the entire day.</p>
 * 
 * <p><b>Learning Focus:</b> Creating objects that manage internal collections and provide methods
 * to process the data stored in those collections.</p>
 */
public class WeatherSensor {
    private final List<Double> hourlyTemps = new ArrayList<>();

    /**
     * Records a temperature reading from the sensor.
     * 
     * @param temp the temperature reading (in Celsius)
     */
    public void record(double temp) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Calculates the average temperature from all recorded readings.
     * 
     * @return the average of all recorded temperatures, or 0 if no readings have been recorded
     */
    public double averageTemp() {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 