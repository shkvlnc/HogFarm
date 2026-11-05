package main;

import java.util.ArrayList;

public class PigRegistry {
    private final ArrayList<Pig> pigs = new ArrayList<>();

    public void registerPig(Pig pig){
        Pig existingPig = findPigByTagNumber(pig.getTagNumber());

        if(existingPig != null){
            throw new IllegalArgumentException(
                    "Pig tag number already exists: " + pig.getTagNumber()
            );
        }

        pigs.add(pig);
    }

    public Pig findPigByTagNumber(String tagNumber){

        for (Pig pig : pigs){
            if(pig.getTagNumber().equals(tagNumber)){
                return pig;
            }
        }

        return null;
    }

    public void listPigs(){
        for (Pig pig : pigs){
            System.out.println(
                    pig.getTagNumber()
                    + " | "
                    + pig.getWeightKg()
                    + " | "
                    + pig.getStatus()
            );
        }
    }

    public int getTotalPigs(){
        return pigs.size();
    }
}
