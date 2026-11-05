package main;

public class Pig {
    private final int id;
    private final String tagNumber;

    private double weightKg;
    private PigStage stage;
    private PigStatus status;

    public Pig(int id, String tagNumber, double weightKg){
        this.id = id;
        this.tagNumber = tagNumber;
        this.weightKg = weightKg;
        this.stage = PigStage.PIGLET;
        this.status = PigStatus.ACTIVE;
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

    public PigStage getStage(){
        return stage;
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

    public void updateStatus (PigStatus newStatus) {
        if(this.status == null){
            throw new IllegalArgumentException(
                    "Pig status cannot be null"
            );
        }


        if(this.status == PigStatus.SOLD || this.status == PigStatus.DECEASED){
            throw new IllegalStateException(
                    "Cannot change the status of SOLD or DECEASED pigs"
            );
        }
        this.status = newStatus;
    }

    public void updateStage (PigStage newStage){
        this.stage = newStage;
    }
}
