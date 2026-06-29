package f_classesandobjects;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class d_TodoItemTest {
    @Test
    void overdue_and_toggle() {
        d_TodoItem t = new d_TodoItem("Finish report",
                LocalDate.now().minusDays(1));
        assertTrue(t.isOverdue(LocalDate.now()));
        t.toggleCompleted();
        assertTrue(t.isCompleted());
    }
} 