package com.sanjusabu.javacompletecourse;

class Animal {
    private String type;
    private String name;

    Animal() {
        this.type = "Unknown";
        this.name = "Unknown";
    }

    Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    void information() {
        System.out.printf("Type: %s%nType: %s%n", this.type, this.name);
    }


    String whoAreYou() {
        return "Who?";
    }
}

class Cat extends Animal {
    public Cat() {}
    public Cat(String type, String name) {
        super(type, name);
    }
}

class Dog extends Animal {
    public Dog() {}
    public Dog(String type, String name) {
        super(type, name);
    }
}

public class SuperMethod20 {
    public static void main(String[] args) {
        Animal orangeCat = new Cat("cat", "orange cat");
        Animal shibaInu = new Dog("dog", "shiba inu");

        System.out.println("Pet 1");
        orangeCat.information();

        System.out.println("Pet 2");
        shibaInu.information();


        System.out.println("Unknown entity");
        new Animal().information();

        System.out.println("Unknown entity");
        System.out.println(new Dog().whoAreYou());
    }
}