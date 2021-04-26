/*
 * Group: Coffee123
 * Project 6
 * Class AccountTest.java tests the functionality of Bank.java
 * Reference: Assert java doc: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
 * use the delta parameter to avoid rounding off issues while comparing floating points.
 * public static void assertEquals(double expected, double actual, double delta)
 * Reference: https://java2blog.com/junit-assertequals/
 */
package banking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {
    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;
    
    public AccountTest() {
        
    }
    
    @BeforeEach
    public void setUp() {
             // Test Fixture: 
      bank = new Bank( "My Bank" );
      custID = bank.addCustomer("Piffl", "Hymie");
      Customer customer = bank.getCustomer( custID );
      Account savings = customer.addSavingsAccount( 0.00, "Test Account" );
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        double actual = bank.getInsufficientFundsPenalty();
        double expected = 10.00;
        double delta = 0.001;  // assert precision
        
        assertEquals(expected, actual, delta, "GetInsufficientFundsPenalty() failed  >>>");
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        double actual = bank.getInsufficientFundsPenalty();
        double expected = 10.00;
        double delta = 0.001;  // assert precision
        
        assertEquals(expected, actual, delta, "GetInsufficientFundsPenalty() failed  >>>");
    }

    /**
     * Test of transfer method, of class Account.
     */
    @Test
    public void testTransfer() {
        double actual = bank.getInsufficientFundsPenalty();
        double expected = 10.00;
        double delta = 0.001;  // assert precision
        
        assertEquals(expected, actual, delta, "GetInsufficientFundsPenalty() failed  >>>");
    }

    /**
     * Test of getAccountDescription method, of class Account.
     *  Not tested in this module
    @Test
    public void testGetAccountDescription() {
    }
    */
    /**
     * Test of setAccountDescription method, of class Account.
     *  Not tested in this module
    @Test
    public void testSetAccountDescription() {
    }
     */
    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        double actual = bank.getInsufficientFundsPenalty();
        double expected = 10.00;
        double delta = 0.001;  // assert precision
        
            assertEquals(expected, actual, delta, "GetInsufficientFundsPenalty() failed  >>>");
    }

    /**
     * Test of getTransactions method, of class Account.
     */
    @Test
    public void testGetTransactions() {
        List<Transaction> expectedList = new ArrayList<>();
        List<Transaction> actualList = new ArrayList<>();
      
        // Add code to initialize expectectedList
        // Add code to get actualList
        
     
        Boolean accountListsAreEqual = expectedList.equals(actualList);
        
        assertTrue(accountListsAreEqual, "GetTransactions() failed >>>");
    }

    /**
     * Test of getTransaction method, of class Account.
     */
    @Test
    public void testGetTransaction() {
         Transaction expectedTransaction = null;
         Transaction actualTransaction = null;
      
        // Add code to initialize expectedTransaction
        // Add code to get actualTransaction
        
     
        Boolean TransactionsAreEqual = expectedTransaction.equals(actualTransaction);
        
        assertTrue(TransactionsAreEqual, "getTransaction() failed >>>");
    }

    /**
     * Test of getAccountId method, of class Account.
     */
    @Test
    public void testGetAccountId() {
         String expectedAccountId = "ID1234";
         String actualAccountId = account.getAccountId() ;
     
        
     
        Boolean AccountsIDsAreEqual = expectedAccountId.equals(actualAccountId);
        
        assertTrue(AccountsIDsAreEqual, "getAccountId()  failed >>>");
    }

    /**
     * Test of getCustomerId method, of class Account.
     */
    @Test
    public void testGetCustomerId() {
         String expectedAccountId = "ID1234";
         String actualAccountId = account.getCustomerId() ;
     
        
     
        Boolean AccountsIDsAreEqual = expectedAccountId.equals(actualAccountId);
        
        assertTrue(AccountsIDsAreEqual, "getCustomerId()  failed >>>");
    }

    /**
     * Test of getAccountCreationDate method, of class Account.
     */
    @Test
    public void testGetAccountCreationDate() {
         LocalDateTime expectedCreationDate = null;
         LocalDateTime actualCreationDate = account.getAccountCreationDate() ;
     
        // Add code to initialize expectedCreationDate
     
        Boolean DatesAreEqual = expectedCreationDate.equals(actualCreationDate);
        
        assertTrue(DatesAreEqual, "getAccountCreationDate()  failed >>>");
       
        
    }

    /**
     * Test of hashCode method, of class Account.
     *  Not tested in this module
    @Test
    public void testHashCode() {
    }
     */
    /**
     * Test of equals method, of class Account.
    *  Not tested in this module
    @Test
    public void testEquals() {
    }
    */
    /**
     * Test of compareTo method, of class Account.
     *  Not tested in this module
     *
    @Test
    public void testCompareTo() {
    }
    * */

    /**
     * Test of toString method, of class Account.
     *  Not tested in this module
    @Test
    public void testToString() {
    }
    */
    public class AccountImpl extends Account {

        public AccountImpl() {
            super(null, 0.0, "");
        }

        public void deposit(double amount) {
              account.deposit(10.00);
              double expected = 10.00;
              double actual = 0;
              double delta = 0.001;  // assert precision
    
              // enter code to retrieve actual amount
          
       assertEquals(expected, actual, delta, "deposit() failed  >>>");
        }

        public void withdraw(double amount) {
              account.withdraw(10.00);
              double expected = 10.00;
              double actual = 0;
              double delta = 0.001;  // assert precision
    
              // enter code to retrieve actual amount
          
       assertEquals(expected, actual, delta, "withdraw() failed  >>>");
        }
    }
    
}
