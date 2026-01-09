package com.sanjusabu.javacompletecourse;



class AnimalLatest {
    String type = "Animal";
    void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class DogLatest extends AnimalLatest {
    @Override
    void sleep() {
        System.out.println("The dog is sleeping");
    }
}

public class MethodOverRiding26 {
    public static void main(String[] args) {
        AnimalLatest entity = new AnimalLatest();
        DogLatest randomDog = new DogLatest();
        DogLatest shiba = new DogLatest() {

            @Override
            void sleep() {
                System.out.println("The shiba is sleeping");
            }
        };

        entity.sleep();
        randomDog.sleep();
        shiba.sleep();

    }
}