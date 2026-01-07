package com.sanjusabu.javacompletecourse;


class PersonalInformation {
    private String name = "";
    public PersonalInformation(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + this.name;
    }
}


public class AnonymousFunction22 {
    public static void main(String[] args) {

        // Anonymous Function
        PersonalInformation sanju = new PersonalInformation("Sanju") {
            @Override
            String getName() {
                return "Over-written";
            }
        };
        System.out.println(sanju.getName());

        // Creating 1 time use object
        System.out.println(new PersonalInformation("Sanju"));
    }
}