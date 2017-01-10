package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivideTest {
    
    public DivideTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws java.lang.Exception{
    }
    
    @AfterClass
    public static void tearDownClass() throws java.lang.Exception{
    }

    /**
     * Test of quotient method, of class Divide.
     */
    @Test
    public void testQuotient() {
        System.out.println("quotient");
        int numerator = 0;
        int denominator = 0;
        Divide instance = new Divide();
        int expResult = 0;
        int result = instance.quotient(numerator, denominator);
        assertEquals(expResult, result);
        numerator = 10;
        denominator = 2;
        expResult = 5;
        result = instance.quotient(numerator, denominator);
        assertEquals(expResult,result);
    }
    
}
