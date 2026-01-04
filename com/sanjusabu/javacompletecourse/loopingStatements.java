package com.sanjusabu.javacompletecourse;

public class loopingStatements {
    public static void main(String[] args) {

        Loops.ForLoop.classicalForLoop();
        Loops.ForLoop.modernForLoop();

        Loops.WhileLoop.whileLoop();
        Loops.DoWhileLoop.doWhileLoop();
    }
}


class Loops {
    static class ForLoop {
        static void classicalForLoop() {
            for (int i = 0; i <= 5; i++) {
                System.out.println("For loop " + i);
            }

        }

        static void modernForLoop() {
            String[] fruits = {"Mango", "Apple", "Grapes", "Strawberry", "Guava"};
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }

    static class WhileLoop {
        static void whileLoop() {
            int i = 0;
            while (i <= 5) {
                System.out.println("While loop " + i);
                i++;
            }
        }
    }

    static class DoWhileLoop {
        static void doWhileLoop() {
            int i = 0;
            do {
                System.out.println("This runs no matter what");
                i++;
            } while (i <= 1);
        }
    }
}