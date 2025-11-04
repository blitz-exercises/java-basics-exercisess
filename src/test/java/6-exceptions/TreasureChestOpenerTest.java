package exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreasureChestOpenerTest {
    @Test void openTreasure_valid() {
        TreasureChestOpener.TreasureChest chest = new TreasureChestOpener.TreasureChest("Golden Sword");
        assertEquals("Golden Sword", TreasureChestOpener.openTreasure(chest));
    }
    @Test void openTreasure_nullChest() {
        assertEquals("No treasure found", TreasureChestOpener.openTreasure(null));
    }
    @Test void openTreasure_nullTreasure() {
        TreasureChestOpener.TreasureChest chest = new TreasureChestOpener.TreasureChest(null);
        assertEquals("No treasure found", TreasureChestOpener.openTreasure(chest));
    }
    @Test void openTreasure_emptyTreasure() {
        TreasureChestOpener.TreasureChest chest = new TreasureChestOpener.TreasureChest("");
        assertEquals("", TreasureChestOpener.openTreasure(chest));
    }
}

