import org.junit.Assert;
import org.junit.Test;

public class FactorialCalculatorTest {

    @Test
    public void RecursionMethod_WithNumberToCalculateBiggerThanZero_ReturnsNumberToCalculateFactorial() throws Exception {
        // Arrange
        int numberToCalculate = 5;
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int expected = 120;

        //Act
        int result  = factorialCalculator.RecursionMethod(numberToCalculate);

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test
    public void RecursionMethod_WithNumberToCalculateEqualsToZero_ReturnsOne() throws Exception {
        // Arrange
        int numberToCalculate = 0;
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int expected = 1;

        //Act
        int result  = factorialCalculator.RecursionMethod(numberToCalculate);

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test(expected = Exception.class)
    public void RecursionMethod_WithNumberToCalculateLessThanZero_ThrowsException() throws Exception {
        // Arrange
        int numberToCalculate = -1;
        FactorialCalculator factorialCalculator = new FactorialCalculator();

        //Act and Assert
        int result = factorialCalculator.RecursionMethod(numberToCalculate);
    }

    @Test
    public void IterativeMethod_WithNumberToCalculateBiggerThanZero_ReturnsNumberToCalculateFactorial() throws Exception{
        // Arrange
        int numberToCalculate = 5;
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int expected = 120;

        //Act
        int result  = factorialCalculator.IterativeMethod(numberToCalculate);

        //Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void IterativeMethod_WithNumberToCalculateEqualsToZero_ReturnsOne() throws Exception {
        // Arrange
        int numberToCalculate = 0;
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int expected = 1;

        //Act
        int result  = factorialCalculator.IterativeMethod(numberToCalculate);

        //Assert
        Assert.assertEquals(expected, result);
    }
    @Test(expected = Exception.class)
    public void IterativeMethod_WithNumberToCalculateLessThanZero_ThrowsException() throws Exception {
        // Arrange
        int numberToCalculate = -1;
        FactorialCalculator factorialCalculator = new FactorialCalculator();

        //Act and Assert
        int result = factorialCalculator.IterativeMethod(numberToCalculate);
    }
}