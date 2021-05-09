package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testThatCalculatorCanAdd(){
        Calculator myCalculator = new Calculator();
        int sum = myCalculator.add(2, 4);
        int result = myCalculator.add(6, 11);

        assertEquals(6, sum);
        assertEquals(17, result);
    }
    @Test
    public void testCalculatorCanMultiply(){
        Calculator lovesCalculator = new Calculator();
        //when
       int result =  lovesCalculator.multiply(5,4);
       assertEquals(20, result);
        //assertEquals(12, result);
    }
    @Test
    public void testThatCalculatorCanDivide(){
        Calculator lovesCalculator = new Calculator();
        //when
        double result = lovesCalculator.divide(2, 0);
        assertEquals(0.0, result);
    }
    @Test
    public void testThatCalculatorCanSubtract(){
        Calculator lovesCalculator = new Calculator();
        int result = lovesCalculator.difference(10, 50);
        assertEquals(40, result);
    }
}
