package com.sanjusabu.javacompletecourse;

class Calculator {

    // Normal calculator only has 2 methods
    double add(double... values) {
        double result = 0;
        for (double value : values) {
            result += value;
        }
        return result;
    }

    double sub(double n1, double n2) {
        return n1 - n2;
    }
}

class AdvancedCalculator2025 extends Calculator{
    // A modern version of normal calculator with couple more methods
    
    double mul(double n1, double n2) {
        return n1 * n2;
    }

    double div(double n1, double n2) {
        if (n2 == 0.0) {
            return 0;
        } else {
            return n1 / n2;
        }
    }

}

class AdvancedCalculator2026 extends AdvancedCalculator2025{
    // An even more advanced calculator than the 2025 version

    double power(double n1, double n2) {
        return Math.pow(n1, n2);
    }
}

public class Inheritance23 {
    public static void main(String[] args) {
        AdvancedCalculator2026 calculator = new AdvancedCalculator2026();

        System.out.println(calculator.add(1,2,3,4,5));
        System.out.println(calculator.sub(10, 5));
        System.out.println(calculator.mul(10, 2));
        System.out.println(calculator.div(10,0));
        System.out.println(calculator.div(10,2));
        System.out.println(calculator.power(10,2));
    }
}
