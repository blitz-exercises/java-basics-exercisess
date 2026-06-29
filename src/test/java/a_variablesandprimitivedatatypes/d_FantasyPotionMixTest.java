package a_variablesandprimitivedatatypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class d_FantasyPotionMixTest {
    @Test
    void ingredientVolumes_750ml() {
        int[] v = d_FantasyPotionMix.ingredientVolumes(750);
        assertArrayEquals(new int[]{225, 375, 150}, v);
    }
} 