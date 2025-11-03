import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdventurePathParserTest {
    @Test void parsePath_valid() {
        assertEquals("Location: Forest, Distance: 10km, Treasures: 5", 
            AdventurePathParser.parsePath("Forest:10:5"));
    }
    @Test void parsePath_invalidNumber() {
        assertEquals("Invalid number in path", 
            AdventurePathParser.parsePath("Forest:ten:5"));
    }
    @Test void parsePath_incomplete() {
        assertEquals("Incomplete path information", 
            AdventurePathParser.parsePath("Forest:10"));
    }
    @Test void parsePath_empty() {
        assertEquals("Incomplete path information", 
            AdventurePathParser.parsePath(""));
    }
    @Test void parsePath_onlyLocation() {
        assertEquals("Incomplete path information", 
            AdventurePathParser.parsePath("Forest"));
    }
    @Test void parsePath_invalidNumberInSecond() {
        assertEquals("Invalid number in path", 
            AdventurePathParser.parsePath("Forest:10:five"));
    }
}

