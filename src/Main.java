public class Main {
    public static void main(String[] args) {

        Pig pig = new Pig(1, "HF-001", 12.5);

        System.out.println("ID: " + pig.getId());
        System.out.println("TagNumber: " + pig.getId());
        System.out.println("Weight: " + pig.getWeightKg());
        System.out.println("Status: " + pig.getStatus());


        try {
            pig.updateWeight(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Could not update weight.");
        }
//        pig.updateWeight(-25.5);
//        pig.updateStatus(PigStatus.GROWER);

        System.out.println("AFTER UPDATE");
        System.out.println("-----------------");
        System.out.println("ID: " + pig.getId());
        System.out.println("TagNumber: " + pig.getId());
        System.out.println("Weight: " + pig.getWeightKg());
        System.out.println("Status: " + pig.getStatus());
    }
}
