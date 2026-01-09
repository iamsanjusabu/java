package com.sanjusabu.javacompletecourse;

abstract class WhoAmI {
    abstract void methodWhoAmI();

    @Override
    public String toString() {
        return "Who are you?";
    }
    void test(){
        System.out.println("0");
    }
}

public class AbstractFeatures27 {
    public static void main(String[] args) {
        WhoAmI steve = new WhoAmI(){
            String name = "sanju";

            @Override
            void methodWhoAmI() {
                System.out.print("I...am Steeeeeeve, nah im " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "\n");
            }
        };
        
        System.out.println(steve);
        steve.methodWhoAmI();
        steve.test();
    }
    
}
