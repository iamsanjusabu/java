package com.sanjusabu.javacompletecourse;

class A {
    void testMethod() {
        System.out.println("From A");
        
    }

    @Override
    public String toString() {
        return "class A";
    }
}

class B extends A { 
    void testMethod() {
        System.out.println("From B");
    }

    void testExclusiveForB() {
        System.out.println("Exclusive method for B");
    }
}

public class TypeCasting24 {
    public static void main(String[] args) {
        // Upcasting
        // Same under the hood
        // A obj = (A) new B();
        // A obj = new B();

        A obj = new B();
        System.out.println(obj);
        // Downcasting
        B obj1 = (B) obj;


        System.out.println(obj1);
        obj.testMethod();
        obj1.testExclusiveForB();
    }
}