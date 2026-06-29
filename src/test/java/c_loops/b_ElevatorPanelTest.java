package c_loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class b_ElevatorPanelTest {
    @Test void negativeInvalid(){ assertFalse(b_ElevatorPanel.isValidFloor(-1)); }
    @Test void zeroValid()     { assertTrue (b_ElevatorPanel.isValidFloor(0)); }
    @Test void outOfRange()    { assertFalse(b_ElevatorPanel.isValidFloor(21)); }
} 