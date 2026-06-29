package b_ifelse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class b_AmusementParkTicketTest {
    @Test void childFree()  { assertEquals(0.0, b_AmusementParkTicket.computePrice(10, 25)); }
    @Test void adultPays()  { assertEquals(25.0, b_AmusementParkTicket.computePrice(30, 25)); }
    @Test void seniorFree() { assertEquals(0.0, b_AmusementParkTicket.computePrice(70, 25)); }
} 