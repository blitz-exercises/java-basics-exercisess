package classesandobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Online Course
 * 
 * <p>An online learning platform offers courses where students can enroll and unenroll.
 * Each course tracks its title and maintains a list of enrolled student names.
 * Track enrollment changes and the total number of students in each course.</p>
 * 
 * <p><b>Learning Focus:</b> Creating objects that maintain relationships with other entities
 * (in this case, students) and managing their collections.</p>
 */
public class Course {
    private final String title;
    private final List<String> students = new ArrayList<>();

    /**
     * Creates a new course.
     * 
     * @param title the name of the course
     */
    public Course(String title) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Enrolls a student in the course.
     * 
     * @param student the name of the student to enroll
     * @return true if the enrollment was successful, false if the student is already enrolled
     */
    public boolean enrol(String student) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Removes a student from the course.
     * 
     * @param student the name of the student to drop
     * @return true if the student was removed, false if the student was not enrolled
     */
    public boolean drop(String student) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Gets the current number of enrolled students.
     * 
     * @return the total enrollment count
     */
    public int getEnrolmentCount() { return students.size(); }
} 