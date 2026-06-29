package f_classesandobjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class b_PetTest {
    @Test
    void speak_dog() {
        assertEquals("Woof!", new b_Pet("Rex","dog",2).speak());
    }
    @Test
    void speak_unknown() {
        assertEquals("...", new b_Pet("Mystery","dragon",500).speak());
    }
} 