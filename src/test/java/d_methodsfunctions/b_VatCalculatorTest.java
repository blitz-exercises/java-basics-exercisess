package d_methodsfunctions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class b_VatCalculatorTest {
    @Test
    void addVat_basic() {
        assertEquals(121.0, b_VatCalculator.addVat(100.0, 21.0), 0.001);
    }
} 