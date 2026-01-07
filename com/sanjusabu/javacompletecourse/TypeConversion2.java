package com.sanjusabu.javacompletecourse;

public class TypeConversion2 {
    public static void main(String[] args) {
        byte b = 10;
        int i = 20;
        float pi = 3.14159F;
        b = (byte) i;
        System.out.println(b);


        int num1 = 546546;
        byte num2 = (byte) num1;
        System.out.println(num2);
    }
}