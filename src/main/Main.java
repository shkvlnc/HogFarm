package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pig> pigs = new ArrayList<>();

        Pig pig1 = new Pig(1, "HF-001", 12.5);
        Pig pig2 = new Pig(2, "HF-002", 15.0);
        Pig pig3 = new Pig(3, "HF-003", 13.7);

        pigs.add(pig1);
        pigs.add(pig2);
        pigs.add(pig3);

        System.out.println("HOG FARM REGISTER");

        for(Pig pig : pigs){
            System.out.println(
                    pig.getTagNumber()
                    + " | "
                    + pig.getWeightKg()
                    + " | "
                    + pig.getStatus()
            );
        }

        System.out.println("Total pigs count: " + pigs.size());
    }
}
