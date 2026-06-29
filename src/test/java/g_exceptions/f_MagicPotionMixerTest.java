package g_exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class f_MagicPotionMixerTest {
    @Test void mixPotion_valid() {
        assertDoesNotThrow(() -> f_MagicPotionMixer.mixPotion("Healing Potion", 50, 3));
    }
    @Test void mixPotion_nullName() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, 
            () -> f_MagicPotionMixer.mixPotion(null, 50, 3));
        assertTrue(e.getMessage().contains("Potion name cannot be empty"));
    }
    @Test void mixPotion_emptyName() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, 
            () -> f_MagicPotionMixer.mixPotion("", 50, 3));
        assertTrue(e.getMessage().contains("Potion name cannot be empty"));
    }
    @Test void mixPotion_negativeMagic() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, 
            () -> f_MagicPotionMixer.mixPotion("Fire Potion", -10, 3));
        assertTrue(e.getMessage().contains("Magic level cannot be negative"));
    }
    @Test void mixPotion_tooHighMagic() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, 
            () -> f_MagicPotionMixer.mixPotion("Fire Potion", 150, 3));
        assertTrue(e.getMessage().contains("Magic level cannot exceed 100"));
    }
    @Test void mixPotion_tooFewIngredients() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, 
            () -> f_MagicPotionMixer.mixPotion("Fire Potion", 50, 1));
        assertTrue(e.getMessage().contains("Need at least 2 ingredients"));
    }
}

