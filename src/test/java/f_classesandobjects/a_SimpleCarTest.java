package f_classesandobjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class a_SimpleCarTest {
    @Test
    void description_basic() {
        a_SimpleCar c = new a_SimpleCar("Tesla","Model 3",2024);
        assertEquals("2024 Tesla Model 3", c.description());
    }
} 