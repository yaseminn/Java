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
public class Exercises2Test {

    public Exercises2Test() {
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
     * Test of intToString method, of class Exercises2.
     */
    @Test
    public void testIntToString() {
        System.out.println("intToString");
        int num = 15;
        String expResult = "15";
        String result = Exercises2.intToString(num);
        assertEquals(expResult, result);

    }
}