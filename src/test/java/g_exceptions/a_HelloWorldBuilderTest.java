package g_exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class a_HelloWorldBuilderTest {
    @Test void build_shouldReturnHelloWorld() {
        String result = a_HelloWorldBuilder.build();
        assertEquals("hello world", result);
    }
    
    @Test void build_shouldHandleExceptionsCorrectly() {
        // This test verifies that exceptions are caught in the right order
        // and letters are added correctly, including the finally block
        String result = a_HelloWorldBuilder.build();
        assertNotNull(result);
        assertEquals("hello world", result);
    }
    
    @Test void build_finallyAlwaysExecutes() {
        // Verify that finally block executes even when exceptions are thrown
        String result = a_HelloWorldBuilder.build();
        assertTrue(result.endsWith("d"), "Finally block should add 'd'");
        assertEquals("hello world", result);
    }
    
    @Test void build_hasCorrectLength() {
        String result = a_HelloWorldBuilder.build();
        assertEquals(11, result.length(), "Should be exactly 'hello world' (11 characters including space)");
    }
}

