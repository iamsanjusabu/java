package com.sanjusabu.javacompletecourse;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomModulesInOpenJDK {
    public static void main(String[] args) {
        RandomModule.demo();
        ThreadLocalRandomModule.demo();

        // Build-in
        // Double (0-1)
        System.out.println(Math.random());
    }
}


class RandomModule {
    static void demo() {
        Random random = new Random();
        int i = random.nextInt(1,11);
        double d = random.nextDouble(1,10);
        boolean b = random.nextBoolean();

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);

    }

}


// Preffered
class ThreadLocalRandomModule {
    static void demo() {
        int i = ThreadLocalRandom.current().nextInt(1, 11);
        double d = ThreadLocalRandom.current().nextDouble(1,10); 
        boolean b = ThreadLocalRandom.current().nextBoolean();

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);

    }
}