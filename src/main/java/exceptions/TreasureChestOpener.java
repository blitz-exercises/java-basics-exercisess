package exceptions;

/**
 * Treasure Chest Opener
 * 
 * <p>An adventurer discovers a treasure chest but must be cautious: the chest itself might be missing,
 * or the treasure inside might be lost. Rather than checking for null before accessing the treasure,
 * use exception handling to gracefully deal with missing treasures.</p>
 * 
 * <p><b>Learning Focus:</b> Using try-catch to handle NullPointerException instead of preventive
 * null checks (demonstrating when exception handling is appropriate).</p>
 */
public class TreasureChestOpener {
    public static class TreasureChest {
        private final String treasure;
        public TreasureChest(String treasure) {
            this.treasure = treasure;
        }
        public String getTreasure() {
            return treasure;
        }
    }
    
    /**
     * Safely retrieves the treasure from a chest.
     * 
     * @param chest the treasure chest (may be null, or may contain null treasure)
     * @return the treasure name if found, or "No treasure found" if the chest or treasure is null
     */
    public static String openTreasure(TreasureChest chest) {
        // TODO: Use try-catch to handle NullPointerException
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

