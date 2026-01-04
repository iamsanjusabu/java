package com.sanjusabu.javacompletecourse;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        boolean isFilled = false;

        while (!isFilled) {
        try {
        System.out.print("What is your name? ");
        name = Capitalize.capitalize(scanner.nextLine());

        System.out.print("How old are you? ");
        age = scanner.nextInt();
        scanner.nextLine();

        isFilled = true;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
        }
        
        scanner.close();

        if (age >=18 && name.toLowerCase().startsWith("sanju")) 
            System.out.printf("Name: %s%nAge: %d%nWelcome Admin%n", name, age);
        else 
            System.out.println("Welcome User");
    }
}

class Capitalize {
    static String capitalize(String str) {
        if (str.length() == 0) 
            return "";
        else 
            return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}