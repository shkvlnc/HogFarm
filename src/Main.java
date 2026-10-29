import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PigRegistry registry = new PigRegistry();

        Pig pig1 = new Pig(1, "HF-001", 12.5);
        Pig pig2 = new Pig(2, "HF-002", 10.5);
        Pig pig3 = new Pig(3, "HF-003", 14.5);

        registry.registerPig(pig1);
        registry.registerPig(pig2);
        registry.registerPig(pig3);

        System.out.println("====HOG FARM REGISTER=====");

        registry.listPigs();

        System.out.println(
                "Total pigs: " + registry.getTotalPigs()
        );
    }
}
