package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Library Catalogue
 * 
 * <p>A library maintains a catalogue of books indexed by their ISBN (a unique identifier for books).
 * Librarians need to add new books, look up books by ISBN, and remove books when they're retired.
 * Implement these operations using a map-based catalogue.</p>
 * 
 * <p><b>Learning Focus:</b> Using maps/dictionaries to store and retrieve data by a unique key.</p>
 */
public class LibraryCatalogue {
    private final Map<String,String> books = new HashMap<>();

    /**
     * Adds a new book to the catalogue.
     * 
     * @param isbn the unique ISBN identifier for the book
     * @param title the title of the book
     */
    public void addBook(String isbn, String title) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Looks up a book in the catalogue by its ISBN.
     * 
     * @param isbn the ISBN to search for
     * @return the title of the book, or null if not found
     */
    public String lookup(String isbn) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Removes a book from the catalogue.
     * 
     * @param isbn the ISBN of the book to remove
     * @return true if a book was removed, false if the ISBN was not found
     */
    public boolean removeBook(String isbn) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 