package tdd;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void instantiateCalculator() {
        Calculator calculator = new Calculator();
        assertThat(calculator).isNotNull();
    }

    @Test
    public void callAddMethodOnCalculator() {
        calculator.add(7, 7);
    }

    @Test
    public void addMethodShouldReturnAResult() {
        int result = calculator.add(7, 7);
    }

    @Test
    public void addMethodShouldSumTheArguments() {
        //arrange
        int firstArg = 7;
        int secondArg = 7;

        //act
        int result = calculator.add(firstArg, secondArg);

        //assert
        assertThat(result).isEqualTo(14);
    }
}
