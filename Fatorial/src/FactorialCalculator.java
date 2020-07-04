public class FactorialCalculator {
    public int RecursionMethod(int numberToCalculate) throws Exception {
        if (numberToCalculate < 0) {
            throw new Exception("You can't calculate factorial for negative numbers");
        }
        if(numberToCalculate == 0) {
            return 1;
        }
        else {
            return (numberToCalculate * RecursionMethod(numberToCalculate-1));
        }
    };
    public int IterativeMethod(int numberToCalculate) throws Exception {
        if (numberToCalculate < 0) {
            throw new Exception("You can't calculate factorial for negative numbers");
        }
        int result = 1;
        int i;

        for(i = 1; i<=numberToCalculate; i++) {
            result = result * i;
        }

        return result;
    }
}
