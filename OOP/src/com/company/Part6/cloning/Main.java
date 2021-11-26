package com.company.Part6.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human durva = new Human(20, "Durwankur");
//        Human clone = new Human(durva);

        Human clone = (Human)durva.clone();
        System.out.println(Arrays.toString(clone.arr));

        clone.arr[0] = 70;

        System.out.println(Arrays.toString(clone.arr));
        System.out.println(Arrays.toString(durva.arr));

        clone.name = "Harshit";

        System.out.println(clone.name);
        System.out.println(durva.name);



    }
}
