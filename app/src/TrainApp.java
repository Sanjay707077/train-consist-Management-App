import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 2: Add Bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Add Duplicate
        train.add("Sleeper"); // duplicate

        // Step 4: Display Formation
        System.out.println("\nTrain Formation (Ordered & Unique):");
        System.out.println(train);
    }
}