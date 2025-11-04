package exceptions;

/**
 * Treasure Chest Opener
 * 
 * Goal: Write a method that safely gets the treasure name from a treasure chest object.
 * The chest might be null, or the treasure inside might be null.
 * Use try-catch to handle NullPointerException and return "No treasure found" instead of crashing.
 * You must use exception handling, not just null checks.
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
    
    public static String openTreasure(TreasureChest chest) {
        // TODO: Use try-catch to handle NullPointerException
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

