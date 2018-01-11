package com.kodilla.testing.calculator;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addResult = calculator.add(180, 19);
        int subResult = calculator.subtract(200, 150);

        if (addResult == 199) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }

        if (subResult == 50) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}
