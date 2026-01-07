package com.sanjusabu.javacompletecourse;

class Mobile {
    private String name;
    private String cpu;
    private int ram;
    private static String type = "Smart Phone";

    public Mobile() {
        name = "unkown";
        cpu = "unkown";
    }

    public Mobile(String name, String cpu, int ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    } 

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: %s%nCPU: %s%nRAM: %s%nType: %s%n".formatted(this.name, this.cpu, this.ram, Mobile.type);
    }
}

public class SetterAndGetter19  {
    public static void main(String[] args) {

        // Phone 1
        System.out.println("Phone 1");
        Mobile iphone = new Mobile();
        iphone.setName("Iphone 17 pro");
        iphone.setCpu("Apple Bionic chip");
        iphone.setRam(12);

        System.out.print(iphone);
        System.out.println(iphone.hashCode());
        // Phone 2

        System.out.println("\nPhone 2");
        Mobile galaxy = new Mobile("S25 Ultra", "Snapdragon", 16);
        System.out.print(galaxy);
        System.out.println(galaxy.hashCode());
    }
}