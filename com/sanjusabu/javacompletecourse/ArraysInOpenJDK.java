package com.sanjusabu.javacompletecourse;

public class ArraysInOpenJDK {
    public static void main(String[] args) {
        String[] names = {"Sanju","Sahil","Shaila","Sabu"};

        String[] elements = new String[4];
        elements[0] ="Sanju";
        elements[1] ="Sahil";
        elements[2] ="Shaila";
        elements[3] ="Sabu";

        // Normal array
        for (String name : names ) {
            System.out.println(name);
        }

        System.out.println();

        // Values assigined to the memory allocated array
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
