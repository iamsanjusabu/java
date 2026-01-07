package com.sanjusabu.javacompletecourse;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Family {
    String name;

    @Override
    public String toString() {
        return name;
    }
}

public class ArrayList2ndVersion18 {
    public static void main(String[] args) {

        Family me = new Family();
        Family brother = new Family();
        Family mother = new Family();
        Family father = new Family();

        me.name = "Sanju";
        brother.name = "Sahil";
        mother.name = "Shaila";
        father.name = "Sabu";

        System.out.println(me);

        // Normal array with a fixed space
        Family[] members1 = new Family[4];
        members1[0] = me;
        members1[1] = brother;
        members1[2] = mother;
        members1[3] = father;

        // Returns memory hash without Arrays.toString()
        System.out.println(Arrays.toString(members1));
        
        // Normal array with a flexible space
        Family[] members2 = {me, brother, mother,father};

        // Returns memory hash without Arrays.toString()
        System.out.println(Arrays.toString(members2));

        // Modern array (ArrayList) with dynamic space
        List<Family> members3 = new ArrayList<>();
        members3.add(me);
        members3.add(brother);
        members3.add(mother);
        members3.add(father);

        System.out.println(members3);
    }
}
