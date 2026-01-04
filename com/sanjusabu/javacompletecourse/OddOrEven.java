package com.sanjusabu.javacompletecourse;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean valueTaken = false;

        // Second method
        String[] options = {"even", "odd"};

        while (!valueTaken) {
            try {
                System.out.print("Enter a number: ");
                n = scanner.nextInt();
                valueTaken = true;

            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid type (use an whole number).");
            }
        }
        scanner.close();

        // First method
        System.out.printf("%d is an %s number%n", n, (n % 2 == 0) ? "even" : "odd");

        // Second method
        System.out.printf("%d is an %s number%n", n, options[Math.abs(n % 2)]);

    }
}