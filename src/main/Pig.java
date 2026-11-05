package main;

public class Pig {
    private final int id;
    private final String tagNumber;

    private double weightKg;
    private PigStatus status;

    public Pig(int id, String tagNumber, double weightKg){
        this.id = id;
        this.tagNumber = tagNumber;
        this.weightKg = weightKg;
        this.status = PigStatus.PIGLET;
    }

    public int getId(){
        return id;
    }

    public String getTagNumber(){
        return tagNumber;
    }

    public PigStatus getStatus(){
        return status;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void updateWeight (double newWeightKg){
        if(newWeightKg <= 0){
            throw new IllegalArgumentException(
                    "Weight must be greater than 0"
            );
        }
        this.weightKg = newWeightKg;
    }

    public void updateStatus (PigStatus newStatus){
        this.status = newStatus;
    }
}
