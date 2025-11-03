/**
 * Hello World Builder
 * 
 * Goal: Build the string "hello world" by catching exceptions and adding letters in catch blocks.
 * 
 * EXCEPTION HIERARCHY:
 * - Throwable is the root of all exceptions
 *   - Error: serious problems (don't catch these)
 *   - Exception: problems that can be handled
 *     - RuntimeException: unchecked exceptions (don't need to be declared)
 *       - NullPointerException
 *       - IllegalArgumentException
 *       - IndexOutOfBoundsException
 *     - Checked exceptions: must be declared with 'throws'
 *       - IOException
 *       - SQLException
 * 
 * CATCH ORDER MATTERS:
 * - Catch more specific exceptions BEFORE more general ones
 * - Exception subclasses must be caught before their parent classes
 * - Example: catch NullPointerException before RuntimeException
 * 
 * FINALLY BLOCK:
 * - Always executes, even if exceptions are thrown or caught
 * - Useful for cleanup code (closing files, releasing resources)
 * - In this exercise, the finally block adds the final "d" to complete "world"
 * 
 * Your task: Implement the methods below to throw the correct exceptions
 * so that the catch blocks execute in order to build "hello world".
 * The letters are added in the catch blocks, NOT in the methods.
 */
public class HelloWorldBuilder {
    private static StringBuilder result = new StringBuilder();
    
    /**
     * Should throw an exception that will be caught by the first catch block.
     * The catch block will add "h".
     */
    public static void addH() {
        // TODO: Throw an exception that will be caught by the first catch block
        // Hint: The first catch block catches NullPointerException
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Should throw an exception that will be caught by the second catch block.
     * The catch block will add "e".
     */
    public static void addE() {
        // TODO: Throw an exception that will be caught by the second catch block
        // Hint: The second catch block catches IllegalArgumentException
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Should throw an exception that will be caught by the third catch block.
     * The catch block will add "l".
     */
    public static void addL() {
        // TODO: Throw an exception that will be caught by the third catch block
        // Hint: The third catch block catches RuntimeException
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Should throw an exception that will be caught by the fourth catch block (first "o").
     * The catch block will add "o".
     */
    public static void addO1() {
        // TODO: Throw an exception that will be caught by the fourth catch block
        // Hint: The fourth catch block catches IndexOutOfBoundsException
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Should throw an exception that will be caught by the fifth catch block (for "w").
     * The catch block will add "w".
     */
    public static void addW() {
        // TODO: Throw an exception that will be caught by the fifth catch block
        // Hint: The fifth catch block catches RuntimeException
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Should throw an exception that will be caught by the sixth catch block (second "o").
     * The catch block will add "o".
     */
    public static void addO2() {
        // TODO: Throw an exception that will be caught by the sixth catch block
        // Hint: The sixth catch block catches RuntimeException
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Should throw an exception that will be caught by the seventh catch block (for "r").
     * The catch block will add "r".
     */
    public static void addR() throws Exception {
        // TODO: Throw an exception that will be caught by the seventh catch block
        // Hint: The seventh catch block catches Exception
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Adds "l" (doesn't throw - completes "worl")
     */
    public static void addL2() {
        result.append("l");
    }
    
    /**
     * Main method that orchestrates exception handling to build "hello world"
     */
    public static String build() {
        result.setLength(0); // Reset StringBuilder
        
        try {
            addH(); // Throws NullPointerException
            
        } catch (NullPointerException e) {
            result.append("h"); // Adds "h"
            try {
                addE(); // Throws IllegalArgumentException
                
            } catch (IllegalArgumentException e2) {
                result.append("e"); // Adds "e"
                try {
                    addL(); // Throws RuntimeException (first l)
                    
                } catch (RuntimeException e3) {
                    result.append("l"); // Adds "l" (first l of "hello")
                    try {
                        addL(); // Throws RuntimeException again (second l)
                        
                    } catch (RuntimeException e4) {
                        result.append("l"); // Adds "l" (second l of "hello")
                        try {
                            addO1(); // Throws IndexOutOfBoundsException
                            
                        } catch (IndexOutOfBoundsException e5) {
                            result.append("o"); // Adds "o"
                            result.append(" "); // Adds space
                            try {
                                addW(); // Throws RuntimeException
                                
                            } catch (RuntimeException e6) {
                                result.append("w"); // Adds "w"
                                try {
                                    addO2(); // Throws RuntimeException
                                    
                                } catch (RuntimeException e7) {
                                    result.append("o"); // Adds "o"
                                    try {
                                        addR(); // Throws Exception
                                        
                                    } catch (Exception e8) {
                                        result.append("r"); // Adds "r"
                                        addL2(); // Adds "l" (the l in "world")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } finally {
            // Finally block always executes - adds the final "d"
            result.append("d");
        }
        
        return result.toString();
    }
}

