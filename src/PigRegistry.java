import java.util.ArrayList;

public class PigRegistry {

    private final ArrayList<Pig> pigs = new ArrayList<>();

    public void registerPig(Pig pig){
        pigs.add(pig);
    }

    public void listPigs(){
        for(Pig pig : pigs){
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
