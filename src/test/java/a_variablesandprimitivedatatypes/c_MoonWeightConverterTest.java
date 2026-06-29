package a_variablesandprimitivedatatypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class c_MoonWeightConverterTest {
    @Test
    void toMoonWeight_example() {
        assertEquals(9.9, c_MoonWeightConverter.toMoonWeight(60), 0.001);
    }
} 