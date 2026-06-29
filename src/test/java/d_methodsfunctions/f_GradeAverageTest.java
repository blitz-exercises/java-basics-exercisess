package d_methodsfunctions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class f_GradeAverageTest {
    @Test void average_basic(){
        assertEquals(75.0, f_GradeAverage.average(new int[]{60,90}), 0.001);
    }
    @Test void average_empty(){
        assertEquals(-1.0, f_GradeAverage.average(new int[]{}), 0.001);
    }
} 