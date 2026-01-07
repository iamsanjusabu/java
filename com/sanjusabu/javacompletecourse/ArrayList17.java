package com.sanjusabu.javacompletecourse;

import java.util.List;
import java.util.ArrayList;

public class ArrayList17 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Appu");
        names.add("Sahil");
        names.add("Shaila");
        names.add("Sabu");
        // Print all names in a list form
        System.out.println(names);

        names.set(0, "Sanju");
        // Print all names in a list form
        System.out.println(names);

        // Check if the ArrayList is empty
        System.out.println(names.isEmpty());

        // Check the size of the ArrayList
        System.out.println(names.size());

        // Remove an element from the ArrayList
        names.remove(0);

        // Print all names in a list form
        System.out.println(names);

        // Clear the array
        names.clear();

        System.out.println(names.size());

        System.out.println(names);
    }
}
