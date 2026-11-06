package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig(1, "HF-001", 25.0);

        pig.updateStage(PigStage.GROWER);
        pig.updateWeight(50.0);
        pig.updateStatus(PigStatus.SOLD);

        try {
            pig.updateStage(PigStage.FINISHER);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            pig.updateWeight(60.0);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Stage: " + pig.getStage());
        System.out.println("Weight: " + pig.getWeightKg());
        System.out.println("Status: " + pig.getStatus());
    }
}
