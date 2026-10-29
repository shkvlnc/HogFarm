public class Pig{

    private final int id;
    private final String tagNumber;

    private double weightKg;
    private PigStatus status;

    public Pig(int id, String tagNumber, double weightKg){
        this.id = id;
        this.tagNumber = tagNumber;
        this.weightKg = weightKg;
        this.status = PigStatus.PIGLETS;
    }

    public int getId(){
        return id;
    }

    public String getTagNumber(){
        return tagNumber;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public PigStatus getStatus(){
        return status;
    }

    public void updateWeightKg(double newWeightKg){
        if(newWeightKg <= 0){
            throw new IllegalArgumentException(
                    "Weight must be greater than zero"
            );
        }
        this.weightKg = newWeightKg;
    }

    public void updateStatus(PigStatus newStatus){
        this.status = newStatus;
    }
}