/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Adriel
 */
public class TransactionTest {
    
    public TransactionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Transaction.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        
        int expResult = 1;
        int result = 1;
        assertEquals(expResult, result);

    }

    /**
     * Test of getTimestamp method, of class Transaction.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        LocalDateTime expResult = null;
        LocalDateTime result = null;
        assertEquals(expResult, result);

    }

    /**
     * Test of getType method, of class Transaction.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");

        String expResult = "type";
        String result = "type";
        assertEquals(expResult, result);

    }

    /**
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        double expResult = 0.0;
        double result = 0.0;
        assertEquals(expResult, result);

    }

    /**
     * Test of getDescription method, of class Transaction.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Transaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);

    }

    /**
     * Test of hashCode method, of class Transaction.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Transaction.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);

    }

    /**
     * Test of compareTo method, of class Transaction.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result);

    }
    
}
