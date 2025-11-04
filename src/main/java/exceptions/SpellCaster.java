package exceptions;

/**
 * Spell Caster
 * 
 * Goal: Write a method that validates a spell before casting. Throw WeakSpellException with descriptive messages:
 * - If spell name is null or empty: "Spell name cannot be empty"
 * - If spell power is less than 10: "Spell power must be at least 10"
 * - If spell name is shorter than 4 characters: "Spell name must be at least 4 characters"
 * - If spell doesn't contain "magic" keyword (case-insensitive): "Spell must contain 'magic'"
 */
public class SpellCaster {
    public static void castSpell(String spellName, int spellPower) throws WeakSpellException {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

