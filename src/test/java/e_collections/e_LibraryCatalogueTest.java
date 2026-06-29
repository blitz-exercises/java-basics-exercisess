package e_collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class e_LibraryCatalogueTest {
    @Test
    void addLookupRemove_cycle() {
        e_LibraryCatalogue lib = new e_LibraryCatalogue();
        lib.addBook("123","Dune");
        assertEquals("Dune", lib.lookup("123"));
        assertTrue( lib.removeBook("123"));
        assertNull( lib.lookup("123"));
    }
} 