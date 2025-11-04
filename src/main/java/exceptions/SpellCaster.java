package exceptions;

/**
 * Spell Caster
 * 
 * <p>A wizard casts spells with specific requirements for success. A spell must have a meaningful name,
 * sufficient power, adequate length, and contain magical essence. If validation fails, throw a custom
 * exception to indicate the spell is too weak or malformed to cast.</p>
 * 
 * <p><b>Learning Focus:</b> Using custom exception classes to provide domain-specific error information.</p>
 */
public class SpellCaster {
    /**
     * Validates a spell before casting.
     * 
     * @param spellName the name of the spell (must not be null/empty and at least 4 characters,
     *                  and must contain the word "magic" case-insensitive)
     * @param spellPower the power level of the spell (must be at least 10)
     * @throws WeakSpellException if any validation requirement is not met
     */
    public static void castSpell(String spellName, int spellPower) throws WeakSpellException {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

