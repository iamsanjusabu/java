package com.sanjusabu.javacompletecourse;

@FunctionalInterface
interface OrganismCopy {
    boolean isAlive();
}

interface AnimalCopy extends OrganismCopy {
    void sleep();
    void bark();
}

class Dog implements AnimalCopy {
    String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.printf("The %s is sleeping...%n", name);
    }

    @Override
    public void bark() {
        System.out.printf("THe %s is barking%n", name);
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}

public class InterfacesInOpenJDK {
    public static void main(String[] args) {
        AnimalCopy shiba;
        shiba = new Dog("Shiba");

        shiba.sleep();
        shiba.bark();
    }
}
