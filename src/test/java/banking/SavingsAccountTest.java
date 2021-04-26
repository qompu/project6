/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Adriel
 */
public class SavingsAccountTest {
    
    public SavingsAccountTest() {
        
        String customerID = "12345";
        double initialBalance = 300.0;
        String description = "John Smith's account"; 
        double interestRate = 0.25;
    }
    
    @BeforeEach
    public void setUp() {

    }

    /**
     * Test of deposit method, of class SavingsAccount.
     */
    @Test
    public void testDeposit() {
        double actual = 100.00;
        double expected = 100.00;
        //add code to initialize values
        assertEquals(expected, actual);        

        
        
    }

    /**
     * Test of withdraw method, of class SavingsAccount.
     */
    @Test
    public void testWithdraw() {
        double actual = 100.00;
        double expected = 100.00;
        //add code to initialize values
                assertEquals(expected, actual);

    }

    /**
     * Test of addInterestTransaction method, of class SavingsAccount.
     */
    @Test
    public void testAddInterestTransaction() {
        double actual = 100.00;
        double expected = 100.00;
        //add code to initialize values        
        assertEquals(expected, actual);

        
        
        
    }

    /**
     * Test of getDefaultInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testGetDefaultInterestRate() {
        System.out.println("GetDefaultInterestRate");
        double expResult = 2.0;
        double result = 2.0;
        //add code to initialize values

        assertEquals(expResult, result);      

    }

    /**
     * Test of setDefaultInterestRate method, of class SavingsAccount.
     */
    @Test
    public void testSetDefaultInterestRate() {
        System.out.println("SetDefaultInterestRate");
        double expResult = 2.0;
        double result = 2.0;
        //add code to initialize values
        assertEquals(expResult, result);

    }
    //
}
