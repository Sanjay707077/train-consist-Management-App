import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add Bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train:");
        System.out.println(train);

        // Step 3: Insert Pantry Car at index 2
        train.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry Car:");
        System.out.println(train);

        // Step 4: Remove first and last
        train.removeFirst();
        train.removeLast();

        // Step 5: Final Train
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}