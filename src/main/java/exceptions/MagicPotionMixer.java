package exceptions;

/**
 * Magic Potion Mixer
 * 
 * <p>A wizard is meticulously crafting magical potions with specific requirements for safety and efficacy.
 * Each potion must have a valid name, controlled magic level, and sufficient ingredients.
 * If any requirement is violated, throw an exception with a descriptive message.</p>
 * 
 * <p><b>Learning Focus:</b> Validating input parameters and throwing checked exceptions to enforce business rules.</p>
 */
public class MagicPotionMixer {
    /**
     * Validates a potion recipe and throws an exception if any requirement is violated.
     * 
     * @param potionName the name of the potion (must not be null or empty)
     * @param magicLevel the potion's magic power level (must be between 0 and 100 inclusive)
     * @param ingredientCount the number of ingredients in the potion (must be at least 2)
     * @throws IllegalArgumentException if any validation fails with a descriptive message
     */
    public static void mixPotion(String potionName, int magicLevel, int ingredientCount) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

