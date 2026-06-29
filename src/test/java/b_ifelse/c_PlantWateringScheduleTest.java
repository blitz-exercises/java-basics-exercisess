package b_ifelse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class c_PlantWateringScheduleTest {
    @Test void mondayTrue() { assertTrue( c_PlantWateringSchedule.shouldWater("Monday") ); }
    @Test void thursdayTrue() { assertTrue( c_PlantWateringSchedule.shouldWater("Thursday") ); }
    @Test void saturdayTrue() { assertTrue( c_PlantWateringSchedule.shouldWater("Saturday") ); }
    @Test void fridayFalse(){ assertFalse(c_PlantWateringSchedule.shouldWater("Friday")); }
} 