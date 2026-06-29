package e_collections;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class c_ShoppingBasketTest {
    @Test
    void join_basic() {
        assertEquals("milk, eggs, bread",
                c_ShoppingBasket.join(List.of("milk", "eggs", "bread")));
    }
} 