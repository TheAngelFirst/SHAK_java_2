import calculator5.Calculator5;
import calculator5.DivisionByZeroException7;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CalculatorTests {

    double  leftLimit = Double.MIN_EXPONENT,
            rightLimit = Double.MAX_EXPONENT,
            a = leftLimit + new Random().nextDouble() * (rightLimit - leftLimit),
            b = leftLimit + new Random().nextDouble() * (rightLimit - leftLimit);

    @Test
    public void positiveSumTesting() {
        String result = new Calculator5().calculateResult(a, "+", b);
        Assert.assertEquals(result, String.format("%.4f", a + b));
    }

    @Test
    public void positiveSubtractionTesting() {
        String result = new Calculator5().calculateResult(a, "-", b);
        Assert.assertEquals(result, String.format("%.4f", a - b));
    }

    @Test
    public void positiveDivisionTesting() {
        String result = new Calculator5().calculateResult(a, "/", b);
        Assert.assertEquals(result, String.format("%.4f", a / b));
    }

    @Test
    public void positiveMultiplicationTesting() {
        String result = new Calculator5().calculateResult(a, "*", b);
        Assert.assertEquals(result, String.format("%.4f", a * b));
    }

}
