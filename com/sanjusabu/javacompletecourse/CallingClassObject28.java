package com.sanjusabu.javacompletecourse;


// interface Computer {
//     public void coding();
// } 

abstract class Computer {
    public abstract void coding();
}

class Desktop extends Computer {
    
    @Override
    public void coding() {
        System.out.println("Coding in Desktop");
    }
}

class Laptop extends Computer {
    
    @Override
    public void coding() {
        System.out.println("Coding in Laptop");
    }
}

class Developer {
    public void getLaptop(Computer laptop) {
    laptop.coding();
}
}

public class CallingClassObject28 {
    public static void main(String[] args) {
        Developer sanju = new Developer();
    
        // sanju.getLaptop(new Computer());   // Not possible when Computer class is abstract
        sanju.getLaptop(new Laptop());
        sanju.getLaptop(new Desktop());
    }
}