package ifelse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlantWateringScheduleTest {
    @Test void mondayTrue() { assertTrue( PlantWateringSchedule.shouldWater("Monday") ); }
    @Test void thursdayTrue() { assertTrue( PlantWateringSchedule.shouldWater("Thursday") ); }
    @Test void saturdayTrue() { assertTrue( PlantWateringSchedule.shouldWater("Saturday") ); }
    @Test void fridayFalse(){ assertFalse(PlantWateringSchedule.shouldWater("Friday")); }
} 