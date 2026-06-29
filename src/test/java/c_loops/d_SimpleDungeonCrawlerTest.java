package c_loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class d_SimpleDungeonCrawlerTest {
    @Test
    void simulate_basic() {
        String[] a = {"hit", "potion", "hit", "hit"};
        assertEquals(4, d_SimpleDungeonCrawler.simulate(a));
    }
} 