package b_ifelse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class a_EvenOddGameTest {
    @Test void classify_even() { assertEquals("wizard", a_EvenOddGame.classify(4)); }
    @Test void classify_odd()  { assertEquals("orc",    a_EvenOddGame.classify(7)); }
} 