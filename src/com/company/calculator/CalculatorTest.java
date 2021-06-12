package com.company.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {


    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();

        //this is correct
        assertEquals( 5, calculator.addition(2,3));

        //this is wrong
        assertEquals( 2, calculator.addition(2,3));
    }


    @Test
    public void whenDivisionThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();

        //this is correct
        assertEquals(2, calculator.division(8, 4));

        //this is wrong
        assertEquals(5, calculator.division(8, 5));
    }

    @Test
    public void whenSubtractionThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();

        //this correct
        assertEquals(4, calculator.subtraction(8, 4));

        //this is wrong
        assertEquals(6, calculator.subtraction(8, 7));
    }

    @Test
    public void whenMultiplicationThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();

        //this is correct
        assertEquals(32, calculator.multiplication(8, 4));

        //this is wrong
        assertEquals(10, calculator.multiplication(18, 9));
    }


    @Test
    public void whenFactorialThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();

        //this is correct
        assertEquals(24, calculator.factorial(4));

        //this is wrong
        assertEquals(10, calculator.factorial(8));
    }

}
