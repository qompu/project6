/*
 * Group: Coffee123
 * Project 6
 * Class BankTest.java tests the functionality of Bank.java
 */
package banking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


public class BankTest {
   private Bank bank;
   private Customer customer;
   private String custID;
   private Account account;
    public BankTest() {
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
     * Test of main method, of class Bank.
     */
    @Test
    public void testMain() {
        // ADD PERSISTANCE MEMORY TESTS HERE: 
        // Database tests: connection, availability, error reporting, random query tests
        
    }

    /**
     * Test of getInsufficientFundsPenalty method, of class Bank.
     */
    @Test
    public void testGetInsufficientFundsPenalty() {
        double actual = bank.getInsufficientFundsPenalty();
        double expected = 10.00;
        double delta = 0.01;  // assert precission
        
        assertEquals(expected, actual, delta, "GetInsufficientFundsPenalty() failed  >>>");
        
    }

    /**
     * Test of setInsufficientFundsPenalty method, of class Bank.
     * 
     * Not tested in this module
  
    @Test
    public void testSetInsufficientFundsPenalty() {
    }
    */

    /**
     * Test of getNAME method, of class Bank.
     */
    @Test
    public void testGetNAME() {
        String actual = bank.getNAME();
        String expected = "testNAME";

        assertEquals(expected, actual, "GetNAME() failed >>>");
    }

    /**
     * Test of addAccountWizard method, of class Bank.
     * Not tested in this module.
     
    @Test
    public void testAddAccountWizard() {
        
        
        
    }
    */

    /**
     * Test of getAllAccounts method, of class Bank.
     */
    @Test
    public void testGetAllAccounts() {
        SortedSet<Account> expectedSet = new TreeSet<>();
        SortedSet<Account> actualSet = new TreeSet<>();
      
        // Add code to initialize expectectedSet
        // Add code to get actualSet
        
     
        Boolean accountSetsAreEqual = expectedSet.equals(actualSet);
        
        assertTrue(accountSetsAreEqual, "GetAllAccounts() failed >>>");
        
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     * 
     * Test add a new customer to the bank.
     * lastName Customer's last (sur- or family) name
     * firstName Customer's first (or given) name
     * return the customer's ID
     */
    @Test
    public void testAddCustomerWizard() {
        String lastName = "testLastName";
        String firstName = "testFirstName";
        String ID;
        
        String expectedID = "AB12345";
        String actualID = bank.addCustomer(lastName, firstName);
        
        assertEquals(expectedID, actualID, "AddCustomerWizard() failed >>>");
        
        
        
    }
       
    
    /**
     * Test of addCustomer method, of class Bank.
     * 
   */

    @Test
    public void testAddCustomer() {
        
        String lastName = "testLastName";
        String firstName = "testFirstName";
        String ID;
        
        String expectedID = "AB12345";
        String actualID = bank.addCustomer(lastName, firstName);
        
        assertEquals(expectedID, actualID, "AddCustomerWizard() failed >>>");
    }
     
    
    
    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Test
    public void testRemoveCustomer() {
        
        String lastName = "testLastName";
        String firstName = "testFirstName";
        String ID;
        
        String expectedID = "";
        String actualID = bank.addCustomer(lastName, firstName);
        
        assertEquals(expectedID, actualID, "AddCustomerWizard() failed >>>");
    }
        
        
    

    /**
     * Test of getAllCustomers method, of class Bank.
     */
    @Test
    public void testGetAllCustomers() {
        
        SortedSet<Customer> expectedSet = new TreeSet<>();
        SortedSet<Customer> actualSet = new TreeSet<>();
      
        // Add code to initialize expectectedSet
        // Add code to get actualSet
        
     
        Boolean accountSetsAreEqual = expectedSet.equals(actualSet);
        
        assertTrue(accountSetsAreEqual, "GetAllCustomers() failed >>>");


    }

    /**
     * Test of getCustomer method, of class Bank.
     * 
     */
    @Test
    public void testGetCustomer_String() {
       String LN = "LastName";
       String FN = "FirstName";
       String BankName = "MyBankName";
       String MyCustID = "AB1234567";
       List<String> expectedList=new LinkedList<String>();
       Customer actualList = bank.getCustomer(MyCustID);
       
       
        // Add code to initialize expectectedList
        // Add code to get actualList
       
        Boolean accountListAreEqual = expectedList.equals(actualList);
        
        assertTrue(accountListAreEqual, "GetCustomer(ID) failed >>>");
        

        
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer_String_String() {
       String LN = "LastName";
       String FN = "FirstName";
       String BankName = "MyBankName";
       String MyCustID = "AB1234567";
       List<String> expectedList=new LinkedList<String>();
       List actualList = bank.getCustomer(LN,FN);
       
       
        // Add code to initialize expectectedList
        // Add code to get actualList
       
        Boolean accountListAreEqual = expectedList.equals(actualList);
        
        assertTrue(accountListAreEqual, "GetCustomer(LN,FN) failed >>>");
            
        
    }

    /**
     * Test of getCustomersAccounts method, of class Bank.
     */
    @Test
    public void testGetCustomersAccounts() {
       String LN = "LastName";
       String FN = "FirstName";
       String BankName = "MyBankName";
       String MyCustID = "AB1234567";
       List<String> expectedList=new LinkedList<String>();
       List<Account> actualList = bank.getCustomersAccounts(MyCustID);
       
       
        // Add code to initialize expectectedList
        // Add code to get actualList
       
        Boolean accountListAreEqual = expectedList.equals(actualList);
        
        assertTrue(accountListAreEqual, "GetCustomerAccounts(ID) failed >>>");
        


    }
    
}
