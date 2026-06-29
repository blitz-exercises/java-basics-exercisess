package e_collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

class d_VowelCounterTest {
    @Test
    void count_basic() {
        Map<Character,Integer> m = d_VowelCounter.count("Hello World");
        assertEquals(1, m.get('e'));
        assertEquals(2, m.get('o'));
    }
} 