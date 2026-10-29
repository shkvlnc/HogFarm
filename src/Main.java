public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig(1, "HF-001", 12.5);

        System.out.println("Pig ID: " + pig.getId());
        System.out.println("Tag: " + pig.getTagNumber());
        System.out.println("Weight: " + pig.getWeightKg());
        System.out.println("Status: " + pig.getStatus());

        pig.updateWeightKg(50);
        pig.updateStatus(PigStatus.GROWER);

        System.out.println("------AFTER UPDATE-------");
        System.out.println("Weight: " + pig.getWeightKg());
        System.out.println("Status " + pig.getStatus());
    }
}
