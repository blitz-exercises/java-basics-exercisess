package exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldBuilderTest {
    @Test void build_shouldReturnHelloWorld() {
        String result = HelloWorldBuilder.build();
        assertEquals("hello world", result);
    }
    
    @Test void build_shouldHandleExceptionsCorrectly() {
        // This test verifies that exceptions are caught in the right order
        // and letters are added correctly, including the finally block
        String result = HelloWorldBuilder.build();
        assertNotNull(result);
        assertEquals("hello world", result);
    }
    
    @Test void build_finallyAlwaysExecutes() {
        // Verify that finally block executes even when exceptions are thrown
        String result = HelloWorldBuilder.build();
        assertTrue(result.endsWith("d"), "Finally block should add 'd'");
        assertEquals("hello world", result);
    }
    
    @Test void build_hasCorrectLength() {
        String result = HelloWorldBuilder.build();
        assertEquals(11, result.length(), "Should be exactly 'hello world' (11 characters including space)");
    }
}

