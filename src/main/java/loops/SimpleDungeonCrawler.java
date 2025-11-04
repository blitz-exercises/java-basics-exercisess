package loops;

/**
 * Simple Dungeon Crawler
 * 
 * <p>A brave adventurer enters a dungeon with 10 health points. During their journey, they encounter
 * various challenges and must make decisions. Combat reduces health, potions restore it (but can't exceed
 * maximum), and the player can choose to exit the dungeon. The adventure ends when the player dies (health <= 0)
 * or chooses to exit.</p>
 * 
 * <p><b>Learning Focus:</b> Using loops with sentinel conditions and branching to simulate game state changes.</p>
 */
public class SimpleDungeonCrawler {
    /**
     * Simulates a dungeon adventure with player health management.
     * 
     * @param actions an array of action strings: "hit" reduces health by 3,
     *                "potion" restores health by 5 (capped at 10), "exit" ends the game
     * @return the player's final health value after the adventure ends
     *         (either when health drops to 0 or below, or when "exit" is encountered)
     */
    public static int simulate(String[] actions) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 