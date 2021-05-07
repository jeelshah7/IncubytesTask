package Tests;

import StringCalculator.StringCalculator;

import static org.junit.Assert;


public class StringCalculatorTest {
    
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();

        int ans = calculator.Add("");

        assertEquals(0,ans);
    }

    @Test
    public void testSingleNumber() {
        StringCalculator calculator = new StringCalculator();

        int ans = calculator.Add("1");

        assertEquals(1,ans);
    }

    @Test 
    public void testTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int ans = calculator.Add("1,2");

        assertEquals(3,ans);
    }

    @Test
    public void multipleTestNumbers() {
        StringCalculator calculator = new StringCalculator();
        int ans = calculator.Add("1,2,5,9");

        assertEquals(17,ans);
    }

    @Test
    public void testNewLine() {
    	StringCalculator calculator = new StringCalculator();
        int ans = calculator.Add("1,\n2,3");

        assertEquals(6,ans);
    }
}
