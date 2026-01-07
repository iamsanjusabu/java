package com.sanjusabu.javacompletecourse;



// For loop with for loop
public class DaysAndHours3 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {
            System.out.println("Day " + i);
            for (int j = 1; j <= 24; j++) {
                System.out.print("Hour " + j + " ");
            }
            System.out.println();
        }
    }
}



// For loop with Do-while
// public class DaysAndHours {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 7; i++) {
//             System.out.println("Day " + i);
            
//             int hour = 1;
//             do {
//                 System.out.print("Hour " + hour + " ");
//                 hour++;
//             } while (hour <= 24);
//             System.out.println();
//         }

//     } 
// }



// For loop with while loop
// public class DaysAndHours {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 7; i++) {
//             System.out.println("Day " + i);

//             int hour = 1;
//             while (hour <= 24) {
//                 System.out.print("Hour " + hour + " ");
//                 hour++;
//             }
//             System.out.println();
//         }
//     }
// }