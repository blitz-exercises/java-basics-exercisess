package a_variablesandprimitivedatatypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class b_CafeTipJarTest {
    @Test
    void totalWithTip_standardCase() {
        double result = b_CafeTipJar.totalWithTip(18.0, 12.0);
        assertEquals(20.16, result, 0.001);
    }
} 