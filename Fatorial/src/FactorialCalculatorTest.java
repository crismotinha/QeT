import org.junit.Assert;
import org.junit.Test;

public class FactorialCalculatorTest {

//    Usando a definição de fatorial, pensei em três casos de testes: quando o número for maior do que zero, igual a zero ou menor que zero.
//    Esses casos foram testados abaixo. Como o propósito do exercício é escrever testes, não me preocupei em usar bigint/double ou testar um limite
//    superior (como fatorial cresce muito rápido, a capacidade do int acaba muito rápido também), porque se a gente quisesse mesmo calcular um fatorial
//    de um número grande, usaríamos outras libs que já pensaram nisso.

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