package com.sanjusabu.javacompletecourse;



// "final" with "class" stops inheritance
public class FinalKeyWord23 {
    private static String name = "Sanju Sabu";
    private static void foo() {
        System.out.println("foo");
    }
    public static void main(String[] args) {
        System.out.println(FinalKeyWord23.name);
        FinalKeyWord23.foo();        
    }
}
