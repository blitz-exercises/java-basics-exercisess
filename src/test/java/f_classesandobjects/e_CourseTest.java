package f_classesandobjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class e_CourseTest {
    @Test
    void enrolDrop_flow() {
        e_Course c = new e_Course("Java 101");
        assertTrue(c.enrol("Alice"));
        assertFalse(c.enrol("Alice"));   // already enrolled
        assertEquals(1, c.getEnrolmentCount());
        assertTrue(c.drop("Alice"));
        assertEquals(0, c.getEnrolmentCount());
    }
} 