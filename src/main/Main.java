package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig(1, "HF-001", 85.0);

        pig.updateStatus(PigStatus.SOLD);

        try {
            pig.updateStatus(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Invalid state: " + e.getMessage());
        }

        System.out.println("Final status: " + pig.getStatus());
    }
}
