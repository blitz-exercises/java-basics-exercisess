package e_collections;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class f_CinemaRowRearrangeTest {
    @Test
    void rearrange_basic() {
        List<Integer> out = f_CinemaRowRearrange.rearrange(List.of(20,15,30,12));
        assertEquals(List.of(15,12,20,30), out);
    }
} 