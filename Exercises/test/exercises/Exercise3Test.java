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
public class Exercise3Test {
    
    public Exercise3Test() {
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
     * Test of countLetter method, of class Exercise3.
     */
    @Test
    public void testCountLetter() {
        System.out.println("countLetter");
        String input = "aabb";
        Exercise3 instance = new Exercise3();
        String expResult = "2a2b";
        String result = instance.countLetter(input);
        assertEquals(expResult, result);

    }
}