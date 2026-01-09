package com.sanjusabu.javacompletecourse;

enum Days {
    SUNDAY(1,"Weekend"), 
    MONDAY(2, "weekday"), 
    TUESDAY(3,"weekday"), 
    WEDNESDAY(4,"weekday"), 
    THURSDAY(5,"weekday"), 
    FRIDAY(6,"weekday"), 
    SATURDAY(7,"weekend");
    
    int day;
    private String type;
    
    Days (int day, String type) {
        this.day = day;
        this.type = type;
    }

    String getType() {
        return type;
    }

    int getDay() {
        return day;
    }
}


public class EnumExample {
    public static void main(String[] args) {
        Days sunday = Days.SUNDAY;


        for (Days day : Days.values() ) {
            System.out.println(day);
        }

        System.out.println(sunday);
        System.out.println(sunday.day);
        System.out.println(sunday.getDay());
        System.out.println(sunday.getType());
        System.out.println(Days.values()[0]);


        // If statement
        if (sunday == Days.SUNDAY) {
            System.out.println("SAME (IF)");
        } else {
            System.out.println("NOT SAME (IF)");
        }

        // Switch 
        switch(sunday) {
            case SUNDAY -> System.out.println("SAME (SWITCH)");
            default -> System.out.println("NOT SAME (SWITCH)");
        }
    }

} 