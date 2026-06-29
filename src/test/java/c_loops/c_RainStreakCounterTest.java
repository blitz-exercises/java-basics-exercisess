package c_loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class c_RainStreakCounterTest {
    @Test
    void longestStreak_sampleWeek() {
        boolean[] week = {true,true,false,true,true,true,false};
        assertEquals(3, c_RainStreakCounter.longestStreak(week));
    }
} 