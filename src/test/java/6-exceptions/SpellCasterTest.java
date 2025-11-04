package exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpellCasterTest {
    @Test void castSpell_valid() throws WeakSpellException {
        assertDoesNotThrow(() -> SpellCaster.castSpell("Fire Magic", 50));
    }
    @Test void castSpell_emptyName() {
        WeakSpellException e = assertThrows(WeakSpellException.class, 
            () -> SpellCaster.castSpell("", 50));
        assertTrue(e.getMessage().contains("Spell name cannot be empty"));
    }
    @Test void castSpell_nullName() {
        WeakSpellException e = assertThrows(WeakSpellException.class, 
            () -> SpellCaster.castSpell(null, 50));
        assertTrue(e.getMessage().contains("Spell name cannot be empty"));
    }
    @Test void castSpell_weakPower() {
        WeakSpellException e = assertThrows(WeakSpellException.class, 
            () -> SpellCaster.castSpell("Fire Magic", 5));
        assertTrue(e.getMessage().contains("Spell power must be at least 10"));
    }
    @Test void castSpell_shortName() {
        WeakSpellException e = assertThrows(WeakSpellException.class, 
            () -> SpellCaster.castSpell("Ice", 50));
        assertTrue(e.getMessage().contains("Spell name must be at least 4 characters"));
    }
    @Test void castSpell_noMagicKeyword() {
        WeakSpellException e = assertThrows(WeakSpellException.class, 
            () -> SpellCaster.castSpell("Fireball", 50));
        assertTrue(e.getMessage().contains("Spell must contain 'magic'"));
    }
    @Test void castSpell_magicKeywordCaseInsensitive() throws WeakSpellException {
        assertDoesNotThrow(() -> SpellCaster.castSpell("ICE MAGIC", 50));
    }
}

