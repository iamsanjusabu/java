package com.sanjusabu.javacompletecourse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        withTryBlock();
    }

    static void withTryBlock() {

        int age = 0;
        String name = "";
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("What is your name?: ");
            name = inputReader.readLine();
            System.out.print("How old are you?: ");
            age = Integer.parseInt(inputReader.readLine());
        } catch (IOException e) {
            System.out.println("Invalid input");
        }

        System.out.printf("Name: %s%nAge: %d%n", name, age);
    }
}
