import org.example.Main;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUpCalculator(){
        calculator = new Main();
    }

    @Test
    public void testAddPositive(){
        int a = 4;
        int b = 5;
        int expectedResult = 9;
        Assert.assertEquals(expectedResult, calculator.add(a, b));
    }
    @Test
    public void testAddNegative(){
        int a = 4;
        int b = 5;
        int expectedResult = 6;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }

    @Test
    public void testSubPositive(){
        int a = 3;
        int b = 9;
        int expectedResult = -6;
        Assert.assertEquals(expectedResult, calculator.sub(a, b));
    }
    @Test
    public void testSubNegative(){
        int a = 3;
        int b = 9;
        int expectedResult = 6;
        Assert.assertNotEquals(expectedResult, calculator.sub(a, b));
    }

    @Test
    public void testMulPositive(){
        int a = 8;
        int b = 4;
        int expectedResult = 32;
        Assert.assertEquals(expectedResult, calculator.mul(a, b));
    }
    @Test
    public void testMulNegative(){
        int a = 8;
        int b = 4;
        int expectedResult = 32;
        Assert.assertNotEquals(expectedResult, calculator.mul(a, b));
    }

    @Test
    public void testDivPositive(){
        int a = 31;
        int b = 16;
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, calculator.div(a, b));
    }
    @Test
    public void testDivNegative(){
        int a = 31;
        int b = 16;
        int expectedResult = 2;
        Assert.assertNotEquals(expectedResult, calculator.div(a, b));
    }
}
