package com.sanjusabu.javacompletecourse;

@FunctionalInterface
interface ExampleInterface {
    void exampleMethod();
}

class ExampleClass implements ExampleInterface {
    @Override
    public void exampleMethod() {
        System.out.println("Example Method");
    }
}

public class CodeRunnerClass {
    public static void main(String[] args) {
        ExampleInterface example1 = new ExampleInterface(){
            @Override
            public void exampleMethod() {
                System.out.println("Anonymous Function");
            }
        };
        example1.exampleMethod();

        ExampleInterface example2 = new ExampleClass();
        example2.exampleMethod();

        // LAMBDA
        ExampleInterface example3 = () -> System.out.println("Lambda");
        example3.exampleMethod();
    }
}