package d_methodsfunctions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class a_HelloHeroTest {
    @Test void greet_basic(){ assertEquals("Welcome, Alex!", a_HelloHero.greet("Alex")); }
} 