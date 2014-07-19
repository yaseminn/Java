/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class NumberTest {
    
    public NumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertTo method, of class Number.
     */
    @Test
    public void testConvertTo() {
        System.out.println("convertTo");
        int n = 23;
        String expResult = "yirmiüç";
        String result = Number.convertTo(n);
        assertEquals(expResult, result);
    }

 
}