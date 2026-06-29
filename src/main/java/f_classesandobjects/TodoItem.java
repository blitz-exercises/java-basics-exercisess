package classesandobjects;

import java.time.LocalDate;

/**
 * Todo Item
 * 
 * <p>A productivity app helps users manage their tasks. Each task has a title and due date.
 * Users can mark tasks as complete or incomplete. The app also needs to identify overdue tasks
 * (those with past due dates that aren't yet completed).</p>
 * 
 * <p><b>Learning Focus:</b> Working with multiple data types (strings, dates, booleans) and
 * methods that interact with them.</p>
 */
public class TodoItem {
    private final String title;
    private final LocalDate dueDate;
    private boolean completed;

    /**
     * Creates a new todo item.
     * 
     * @param title the title/description of the task
     * @param dueDate the date when the task is due
     */
    public TodoItem(String title, LocalDate dueDate) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Toggles the completion status of the task.
     * If the task is complete, marks it incomplete, and vice versa.
     */
    public void toggleCompleted() {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Checks if the task is complete.
     * 
     * @return true if the task is marked as completed
     */
    public boolean isCompleted() { return completed; }

    /**
     * Checks if the task is overdue.
     * 
     * @param now the current date to use for comparison
     * @return true if the due date is in the past and the task is not yet completed
     */
    public boolean isOverdue(LocalDate now) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 