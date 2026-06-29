package a_variablesandprimitivedatatypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class a_PocketMoneyTrackerTest {
    @Test
    void calculateTotal_shouldReturn8() {
        assertEquals(8, a_PocketMoneyTracker.calculateTotal(5, 3));
    }
} 