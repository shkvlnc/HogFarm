package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PigRegistry pigRegistry = new PigRegistry();

        Pig pig1 = new Pig(1, "HF-001", 12.4);
        Pig pig2 = new Pig(2, "HF-002", 13.1);
        Pig pig3 = new Pig(3, "HF-003", 12.7);

        pigRegistry.registerPig(pig1);
        pigRegistry.registerPig(pig2);
        pigRegistry.registerPig(pig3);

        try{
            Pig duplicatePig = new Pig(4, "HF-004", 20.0);

            pigRegistry.registerPig(duplicatePig);
        }catch (IllegalArgumentException e){
            System.out.println("Registration failed : " + e.getMessage());
        }

        pigRegistry.listPigs();
    }
}

//test
