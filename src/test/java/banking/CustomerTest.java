/*
 * Group: Coffee123
 * Project 6
 * Class CustomerTest.java tests the functionality of Bank.java
 * Reference: Assert java doc: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
 * use the delta parameter to avoid rounding off issues while comparing floating points.
 * public static void assertEquals(double expected, double actual, double delta)
 * Reference: https://java2blog.com/junit-assertequals/
 */
package banking;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CustomerTest {
    
    public CustomerTest() {         

    }
    
    @BeforeEach
    public void setUp() {
        String testbank = "TestBANK";
        String testlastname = "testLASTNAME";
        String testfirstname = "testFIRSTNAME";  
    }

    /**
     * Test of getBank method, of class Customer.
     */
    @Test
    public void testGetBank() {
        Bank expectedBank = null;
        Bank actualBank = null;

        // add code to create expected and actual Bank objects
        
        Boolean BanksAreEqual = expectedBank.equals(actualBank);
        
        assertTrue(BanksAreEqual, "getBank()  failed >>>");
        
    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    public void testGetCustomerId() {
        String expectedCustomerID = "ID12345";
        String actualCustomerID = null;

        // add code to get expected object
        
        Boolean CustomerIDsAreEqual = expectedCustomerID.equals(actualCustomerID);
        
        assertTrue(CustomerIDsAreEqual, "getCustomerID()  failed >>>");
        
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        String expectedCustomerID = "ID12345";
        String actualCustomerID = null;

        // add code to get expected object
        
        Boolean CustomerIDsAreEqual = expectedCustomerID.equals(actualCustomerID);
        
        assertTrue(CustomerIDsAreEqual, "getCustomerID()  failed >>>");
    }

    /**
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        String expectedCustomerID = "ID12345";
        String actualCustomerID = null;

        // add code to get expected object
        
        Boolean CustomerIDsAreEqual = expectedCustomerID.equals(actualCustomerID);
        
        assertTrue(CustomerIDsAreEqual, "getCustomerID()  failed >>>");
    }

    /**
     * Test of getCustomerAccounts method, of class Customer.
     */
    @Test
    public void testGetCustomerAccounts() {
       String LN = "LastName";
       String FN = "FirstName";
       String BankName = "MyBankName";
       String MyCustID = "AB1234567";
       SortedSet<Account> expectedSet = new TreeSet<>();
       SortedSet<Account> actualSet = new TreeSet<>();
       
       
        // Add code to initialize expectectedSet
        // Add code to get actualSet
       
        Boolean accountListAreEqual = expectedSet.equals(actualSet);
        
        assertTrue(accountListAreEqual, "getCustomerAccounts(ID) failed >>>");
    }

    /**
     * Test of ytdFees method, of class Customer.
     */
    @Test
    public void testYtdFees() {
        double actual = 0; 
        double expected = 10.00;
        double delta = 0.001;  // assert precision
        
        // add code to get actual ytdfees object
        
        assertEquals(expected, actual, delta, "ytdFees() failed  >>>");
    }

    /**
     * Test of ytdInterest method, of class Customer.
     */
    @Test
    public void testYtdInterest() {
        double actual = 0; 
        double expected = 3.00;
        double delta = 0.001;  // assert precision
        
        // add code to get actual ytdInterest object
        
        assertEquals(expected, actual, delta, "ytdInterest() failed  >>>");
    }

    /**
     * Test of addSavingsAccount method, of class Customer.
     */
    @Test
    public void testAddSavingsAccount() {
        SavingsAccount espectedSavingsAccount = null;
        SavingsAccount actualSavingsAccount = null;
        
       // add code to instantiate actual and expected objects
       
        Boolean accountListAreEqual = espectedSavingsAccount.equals(actualSavingsAccount);
        
        assertTrue(accountListAreEqual, "addSavingsAccount() failed >>>");
       
        
    }

    /**
     * Test of removeAccount method, of class Customer.
     */
    @Test
    public void testRemoveAccount() {
        
        String actualID = null;
        String expectedID = "N/A";
        
       // add code to get actual ID
       
        Boolean accounIDsAreEqual = expectedID.equals(actualID);
        
        assertTrue(accounIDsAreEqual, "removeAccount() failed >>>");
        
        
    }

    /**
     * Test of getAccount method, of class Customer.
     */
    @Test
    public void testGetAccount() {
        
        Account actualAccount = null;
        Account expectedAccount = null;
        
       // add code to get actual and expected account objects
       
        Boolean accounIDsAreEqual = expectedAccount.equals(actualAccount);
        
        assertTrue(accounIDsAreEqual, "getAccount() failed >>>");
        
    }

    /**
     * Test of toString method, of class Customer.
     *  Not tested in this module
     *
    @Test
    public void testToString() {
    }
    * */

    /**
     * Test of hashCode method, of class Customer.
     *  Not tested in this module
     *
    @Test
    public void testHashCode() {
    }
    */
    
    /**
     * Test of equals method, of class Customer.
     *  Not tested in this module
     *
    @Test
    public void testEquals() {
    }
    * */

    /**
     * Test of compareTo method, of class Customer.
     *  Not tested in this module
     *
    @Test
    public void testCompareTo() {
    }
    */
}
