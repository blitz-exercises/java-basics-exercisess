package f_classesandobjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class g_MiniRpgTest {
    @Test
    void battle_simple() {
        g_MiniRpg.Character hero = new g_MiniRpg.Character("Hero", 10, 4);
        g_MiniRpg.Character monster = new g_MiniRpg.Character("Goblin", 8, 3);
        String winner = g_MiniRpg.battle(hero, monster);
        assertEquals("Hero", winner);
        assertTrue(hero.isAlive());
        assertFalse(monster.isAlive());
    }
} 