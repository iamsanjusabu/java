package com.sanjusabu.javacompletecourse;

import java.util.Scanner;

public class Palindrome10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("Enter the string to be checked: ");
        name = scanner.nextLine().strip();
        scanner.close();

        String reversed = new StringBuilder(name).reverse().toString();

        if (name.equals(reversed)) {
            System.out.printf("%s is Palindrome%n", name);
        } else {
            System.out.printf("%s is not Palindrome%n", name);
        }
    }
}