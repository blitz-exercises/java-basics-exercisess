package classesandobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Online Course
 * 
 * Goal: Class Course has title and a list of enrolled Student objects. Add methods enrol() and drop(), keep count.
 */
public class Course {
    private final String title;
    private final List<String> students = new ArrayList<>();

    public Course(String title) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public boolean enrol(String student) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public boolean drop(String student) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public int getEnrolmentCount() { return students.size(); }
} 