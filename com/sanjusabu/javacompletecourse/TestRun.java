package com.sanjusabu.javacompletecourse;

public class TestRun {
    public static void main(String[] args) {

        String name1 = "Sanju";
        String name2 = new String();
        name2 = "Sanju";
        name1 = "10";
        char[] name3 = {'s', 'a', 'n', 'j', 'u','1'};
        System.out.println(name3);
        System.out.println(name1);
        
        System.out.println(name2);

        double n1 = 10;
        double n2 = 20;
        double result = n1 + n2;
        System.out.printf("%.0f + %.0f = %.0f%n", n1, n2, result);
    }
}