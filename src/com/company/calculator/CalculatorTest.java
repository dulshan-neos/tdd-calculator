package com.company.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void whenCalculatorInitializedThenReturnTrue() {
        Calculator calculator = new Calculator();

        assertTrue(calculator.getStatus());
    }

    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();

        assertEquals( 5, calculator.addition(2,3));
    }


    @Test
    public void whenDivisionThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.division(8, 4));
    }

    @Test
    public void whenSubtractionThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtraction(8, 4));
    }

    @Test
    public void whenMultiplicationThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();
        assertEquals(32, calculator.multiplication(8, 4));
    }

}
