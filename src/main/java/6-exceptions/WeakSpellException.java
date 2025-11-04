package exceptions;

/**
 * Weak Spell Exception
 * 
 * Goal: Create a custom exception class WeakSpellException that extends Exception.
 * It should have a constructor that takes a message describing why the spell is too weak.
 */
public class WeakSpellException extends Exception {
    public WeakSpellException(String message) {
        super(message);
    }
}

