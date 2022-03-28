package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animal1 = {new Sark("kk"),

                new Turtle("jkljgip"),
                new Eagle("kbk")};
        for (Animal a : animal1) {
            if (a instanceof Sark) {
                ((Sark) a).attack();
            } else if (a instanceof Eagle) {
                ((Eagle) a).fly();
            } else if (a instanceof Turtle) {
                ((Turtle) a).swim();
            } else {
                a.method();
            }
        }

        Eagle[] eagles = new Eagle[1];
        Turtle[] turtles = new Turtle[1];
        int index = 0;
        int index1=0;
        int index2=0;
        Sark[] sarks = new Sark[1];
        for (Animal s : animal1) {
            if (s instanceof Sark) {
                sarks[index] = ((Sark) s);
            }
            else if (s instanceof Turtle){
                turtles[index1]=((Turtle) s);
            }else if (s instanceof  Eagle){
                eagles[index2] = ((Eagle) s );
            }

        }


        System.out.println(Arrays.toString(sarks) +" "+Arrays.toString(turtles)+" "+Arrays.toString(eagles));

    }
}





