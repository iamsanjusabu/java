package com.sanjusabu.javacompletecourse;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NormalSwitch12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        String modernSwitchDay;
        String oldSwitchDay;
        
        try {
            System.out.print("Enter the number (1/2/3/4/5/6/7): ");
            n = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Whole number only!");
            return;

        } finally {
            scanner.close();
        }

        // Modern Switch
        System.out.println("Modern Switch");
        modernSwitchDay = Switches.modernSwitch(n);
        System.out.println(modernSwitchDay);

        // Old Switch
        System.out.println("Old Switch");
        oldSwitchDay = Switches.oldSwitch(n);
        System.out.println(oldSwitchDay);
    }    
} 


class Switches {
    static String modernSwitch(int n) {
        return switch (n) {
            case 1 -> {
                System.out.println("Weekend");
                yield "Sunday"; 
            }
            case 2 -> {
                System.out.println("Weekday");
                yield "Monday";

            }
            case 3 -> {
                System.out.println("Weekday");
                yield "Tuesday";
            }
            case 4 -> {
                System.out.println("Weekday");
                yield "Wednesday";
            }

            case 5 -> {
                System.out.println("Weekday");
                yield "Thursday";
            }

            case 6 -> {
                System.out.println("Weekday");
                yield "Friday";
            }

            case 7 -> {
                System.out.println("Weekend");
                yield "Saturday";
            }
            default -> "Invalid day";
        };
    }

    static String oldSwitch(int n) {
        String result;
        switch (n) {
            case 1:
                System.out.println("Weekend");
                result = "Sunday";
                break;
            case 2:
                System.out.println("Weekday");
                result = "Monday";
                break;
            case 3:
                System.out.println("Weekday");
                result = "Tuesday";
                break;
            case 4:
                System.out.println("Weekday");
                result = "Wednesday";
                break;
            case 5:
                System.out.println("Weekday");
                result = "Thursday";
                break;
            case 6:
                System.out.println("Weekday");
                result = "Friday";
                break;
            case 7:
                System.out.println("Weekend");
                result = "Saturday";
                break;
            default:
                result = "Invalid day";
                break;
        }
        return result;
    }
}