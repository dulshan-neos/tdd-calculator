package com.company.calculator;

public class Calculator {

    public Calculator() {

    }


    public int addition(int a, int b) {
        return a + b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return (a * factorial(a - 1));
        }
    }


}
