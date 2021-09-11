package src.miniTarea1.bank;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;
    
    @Before
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void testDeposite() {
    assertFalse(bank.hasAccount("Pedro Alvarez"));
    bank.deposite("Pedro Alvarez", 100);
    assertTrue(bank.hasAccount("Pedro Alvarez"));
    assertEquals(bank.balance("Pedro Alvarez"), 100);
    }

    @Test
    public void testNumberOfTransactions() {
    bank.deposite("Pedro Alvarez", 100);
    assertEquals(bank.numberOfTransactions("Pedro Alvarez"),1);
    bank.deposite("Pedro Alvarez", 50);
    assertEquals(bank.numberOfTransactions("Pedro Alvarez"), 2);
 }
}