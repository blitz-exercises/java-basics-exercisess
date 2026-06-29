package g_exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class b_TreasureChestOpenerTest {
    @Test void openTreasure_valid() {
        b_TreasureChestOpener.TreasureChest chest = new b_TreasureChestOpener.TreasureChest("Golden Sword");
        assertEquals("Golden Sword", b_TreasureChestOpener.openTreasure(chest));
    }
    @Test void openTreasure_nullChest() {
        assertEquals("No treasure found", b_TreasureChestOpener.openTreasure(null));
    }
    @Test void openTreasure_nullTreasure() {
        b_TreasureChestOpener.TreasureChest chest = new b_TreasureChestOpener.TreasureChest(null);
        assertEquals("No treasure found", b_TreasureChestOpener.openTreasure(chest));
    }
    @Test void openTreasure_emptyTreasure() {
        b_TreasureChestOpener.TreasureChest chest = new b_TreasureChestOpener.TreasureChest("");
        assertEquals("", b_TreasureChestOpener.openTreasure(chest));
    }
}

