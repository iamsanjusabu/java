package com.sanjusabu.javacompletecourse;

public class Calculator5 {
    public static void main(String[] args) {
        CalculatorUtil calculator = new CalculatorUtil();
        double addition = calculator.addition(1,2,3,4,5,5,6,7,8,9,10);
        double subraction = calculator.subtraction(30, 3.14159);
        double multiplication = calculator.multiplication(10, 10);
        double division = calculator.division( 10,0);
        System.out.println(addition);
        System.out.println(subraction);
        System.out.println(multiplication);
        System.out.println(division);

    }
}

class CalculatorUtil {
    double addition(double... values) {
        double result = 0;
        for (double value : values) {
            result += value;
        }
        return result;
    }

    double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    double division(double n1, double n2) {
        if (n2 == 0.0) {
            throw new ArithmeticException("Hello");
        } else {
            return n1 / n2;
        }
    }
}