package tuan4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phixuanhoan
 */
public class testJunitTest {
    
    public testJunitTest() {
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
     * Test of Max method, of class testJunit.
     */
    @Test
    public void testMax() {
        System.out.println("Max");
        int a = 3;
        int b = 3;
        int expResult = 3;
        int result = testJunit.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax2() {
        System.out.println("Max");
        int a = 100;
        int b = 1000;
        int expResult = 1000;
        int result = testJunit.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax3() {
        System.out.println("Max");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = testJunit.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testMax4() {
        System.out.println("Max");
        int a = 7;
        int b = 2;
        int expResult = 7;
        int result = testJunit.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testMax5() {
        System.out.println("Max");
        int a = 123;
        int b = 1234;
        int expResult = 1234;
        int result = testJunit.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MinArr method, of class testJunit.
     */
    @Test
    public void testMinArr() {
        System.out.println("MinArr");
        int[] arr = {1,2,3,4,5,6,7,8};
        int expResult = 1;
        int result = testJunit.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinArr2() {
        System.out.println("MinArr");
        int[] arr = {7,5,8,4};
        int expResult = 4;
        int result = testJunit.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinArr3() {
        System.out.println("MinArr");
        int[] arr = {12,54,65,87};
        int expResult = 12;
        int result = testJunit.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinArr4() {
        System.out.println("MinArr");
        int[] arr = {1,4,6,3,0};
        int expResult = 0;
        int result = testJunit.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinArr5() {
        System.out.println("MinArr");
        int[] arr = {-7,-6,-7,10};
        int expResult = -7;
        int result = testJunit.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BMI method, of class testJunit.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double weight = 60.0;
        double height = 1.70;
        String expResult = "Bình thường";
        String result = testJunit.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double weight = 70.0;
        double height = 1.70;
        String expResult = "Thừa cân";
        String result = testJunit.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double weight = 80.0;
        double height = 1.70;
        String expResult = "Béo phì";
        String result = testJunit.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double weight = 80.0;
        double height = 1.6;
        String expResult = "Béo phì";
        String result = testJunit.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double weight = 60.0;
        double height = 1.8;
        String expResult = "Bình thường";
        String result = testJunit.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BMI method, of class testJunit.
     */
    
    
}
