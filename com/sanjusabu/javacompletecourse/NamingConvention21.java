package com.sanjusabu.javacompletecourse;

public class NamingConvention21 {

    // Class level variable naming
    private static int age = 19;
    private static String fullName = "Sanju Sabu";

    // Method naming
    static String personalInfo() {
        return "Name: %s%nAge: %d".formatted(fullName, age); 
    }

    public static void main(String[] args) {
        System.out.println(NamingConvention21.personalInfo());
    }



    /*
    age / firstName  - variable
    Human() - class name
    personalInfo() - Method
    MY_DATA / MYDATA - Constant
    */
}
