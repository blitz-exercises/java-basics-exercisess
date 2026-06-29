package g_exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class c_AdventurePathParserTest {
    @Test void parsePath_valid() {
        assertEquals("Location: Forest, Distance: 10km, Treasures: 5", 
            c_AdventurePathParser.parsePath("Forest:10:5"));
    }
    @Test void parsePath_invalidNumber() {
        assertEquals("Invalid number in path", 
            c_AdventurePathParser.parsePath("Forest:ten:5"));
    }
    @Test void parsePath_incomplete() {
        assertEquals("Incomplete path information", 
            c_AdventurePathParser.parsePath("Forest:10"));
    }
    @Test void parsePath_empty() {
        assertEquals("Incomplete path information", 
            c_AdventurePathParser.parsePath(""));
    }
    @Test void parsePath_onlyLocation() {
        assertEquals("Incomplete path information", 
            c_AdventurePathParser.parsePath("Forest"));
    }
    @Test void parsePath_invalidNumberInSecond() {
        assertEquals("Invalid number in path", 
            c_AdventurePathParser.parsePath("Forest:10:five"));
    }
}

