package e_collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class a_BusSeatsTest {
    @Test
    void firstFree_basic() {
        boolean[] seats = new boolean[40];
        seats[0] = true; seats[1] = true; // occupied
        assertEquals(2, a_BusSeats.firstFree(seats));
    }
} 