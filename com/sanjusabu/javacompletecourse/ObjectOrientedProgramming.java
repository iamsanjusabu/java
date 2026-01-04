package com.sanjusabu.javacompletecourse;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sanju", 19, 'M', "Backend");
        System.out.println(employee1);
    }
}

@SuppressWarnings("unused")
class Employee {
    private String name;
    private int age;
    private char gender;
    private String department;

    public Employee(String name, int age, char gender, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

    public void SetDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Hello World";
    }
}