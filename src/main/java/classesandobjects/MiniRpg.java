package classesandobjects;

/**
 * Mini-RPG Combat
 * 
 * <p>A simple RPG battle system pits heroes against monsters. Each character (hero or monster)
 * has health points and attack power. During combat, characters take turns attacking each other.
 * The battle ends when one character faints (health reaches 0 or below).</p>
 * 
 * <p><b>Learning Focus:</b> Creating objects that interact with each other to simulate complex
 * behavior (combat mechanics in this case).</p>
 */
public class MiniRpg {

    static class Character {
        private final String name;
        private int health;
        private final int attack;

        /**
         * Creates a new character.
         * 
         * @param name the character's name
         * @param health the character's starting health points
         * @param attack the character's attack power
         */
        Character(String name, int health, int attack) {
            // TODO
            throw new UnsupportedOperationException("Not yet implemented");
        }
        
        /**
         * Checks if the character is still alive.
         * 
         * @return true if health is greater than 0
         */
        boolean isAlive() { return health > 0; }
        
        /**
         * Attacks another character.
         * 
         * @param target the character being attacked
         */
        void attack(Character target) {
            // TODO
            throw new UnsupportedOperationException("Not yet implemented");
        }
        
        /**
         * Gets the character's current health.
         * 
         * @return the current health points
         */
        int getHealth() { return health; }
        
        /**
         * Gets the character's name.
         * 
         * @return the character's name
         */
        String getName() { return name; }
    }

    /**
     * Conducts a battle between two characters until one faints.
     * 
     * @param a the first character
     * @param b the second character
     * @return the name of the winning character (the one still alive)
     */
    public static String battle(Character a, Character b) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 