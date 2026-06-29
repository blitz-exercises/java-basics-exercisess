package d_methodsfunctions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class c_SpeedUnitSwitcherTest {
    @Test void kmhToMps(){ assertEquals(10.0, c_SpeedUnitSwitcher.kmhToMps(36.0), 0.001); }
    @Test void mpsToKmh(){ assertEquals(36.0, c_SpeedUnitSwitcher.mpsToKmh(10.0), 0.001); }
} 