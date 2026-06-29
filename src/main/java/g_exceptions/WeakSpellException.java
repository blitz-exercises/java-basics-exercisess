package exceptions;

/**
 * Weak Spell Exception
 * 
 * <p>A custom exception thrown when a wizard attempts to cast a spell that doesn't meet the
 * minimum requirements for successful casting. This exception extends Exception, making it a
 * checked exception that must be declared in method signatures.</p>
 * 
 * <p><b>Learning Focus:</b> Creating custom exception classes to provide domain-specific error information
 * and enforcing that certain error conditions must be handled by callers.</p>
 */
public class WeakSpellException extends Exception {
    /**
     * Creates a new WeakSpellException with a descriptive message.
     * 
     * @param message a description of why the spell is too weak or invalid
     */
    public WeakSpellException(String message) {
        super(message);
    }
}

