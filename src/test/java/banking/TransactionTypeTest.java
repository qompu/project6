/*
 * Group: Coffee123
 * Project 6
 * Class TransactionType.java tests the functionality of Bank.java
 * 
 */
package banking;

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
public class TransactionTypeTest {
    
    public TransactionTypeTest() {
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
     * Test of values method, of class TransactionType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TransactionType[] expResult = null;
        TransactionType[] result = null;
        assertArrayEquals(expResult, result);
        //add code to initialize values


    }

    /**
     * Test of valueOf method, of class TransactionType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        TransactionType expResult = null;
        TransactionType result = null;
        assertEquals(expResult, result);
        //add code to initialize values

    }
    
}
