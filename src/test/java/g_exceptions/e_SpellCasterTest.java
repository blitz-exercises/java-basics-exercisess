package g_exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class e_SpellCasterTest {
    @Test void castSpell_valid() throws d_WeakSpellException {
        assertDoesNotThrow(() -> e_SpellCaster.castSpell("Fire Magic", 50));
    }
    @Test void castSpell_emptyName() {
        d_WeakSpellException e = assertThrows(d_WeakSpellException.class, 
            () -> e_SpellCaster.castSpell("", 50));
        assertTrue(e.getMessage().contains("Spell name cannot be empty"));
    }
    @Test void castSpell_nullName() {
        d_WeakSpellException e = assertThrows(d_WeakSpellException.class, 
            () -> e_SpellCaster.castSpell(null, 50));
        assertTrue(e.getMessage().contains("Spell name cannot be empty"));
    }
    @Test void castSpell_weakPower() {
        d_WeakSpellException e = assertThrows(d_WeakSpellException.class, 
            () -> e_SpellCaster.castSpell("Fire Magic", 5));
        assertTrue(e.getMessage().contains("Spell power must be at least 10"));
    }
    @Test void castSpell_shortName() {
        d_WeakSpellException e = assertThrows(d_WeakSpellException.class, 
            () -> e_SpellCaster.castSpell("Ice", 50));
        assertTrue(e.getMessage().contains("Spell name must be at least 4 characters"));
    }
    @Test void castSpell_noMagicKeyword() {
        d_WeakSpellException e = assertThrows(d_WeakSpellException.class, 
            () -> e_SpellCaster.castSpell("Fireball", 50));
        assertTrue(e.getMessage().contains("Spell must contain 'magic'"));
    }
    @Test void castSpell_magicKeywordCaseInsensitive() throws d_WeakSpellException {
        assertDoesNotThrow(() -> e_SpellCaster.castSpell("ICE MAGIC", 50));
    }
}

