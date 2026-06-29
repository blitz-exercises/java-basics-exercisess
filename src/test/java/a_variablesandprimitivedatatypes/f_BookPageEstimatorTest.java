package a_variablesandprimitivedatatypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class f_BookPageEstimatorTest {
    @Test
    void estimatePages_ninetyMinutes() {
        assertEquals(60.0, f_BookPageEstimator.estimatePages(40, 90), 0.001);
    }
} 