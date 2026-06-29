package d_methodsfunctions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class g_TinyEncryptionTest {
    @Test
    void shiftCipher_simple() {
        assertEquals("Uifsf", g_TinyEncryption.shiftCipher("There", 1));
    }
} 