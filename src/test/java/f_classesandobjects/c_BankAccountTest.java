package f_classesandobjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class c_BankAccountTest {
    @Test
    void depositWithdraw_flow() {
        c_BankAccount acc = new c_BankAccount("Rens",100);
        assertTrue(acc.deposit(50));
        assertFalse(acc.withdraw(200));
        assertTrue(acc.withdraw(120));
        assertEquals(30, acc.getBalance(), 0.001);
    }
} 