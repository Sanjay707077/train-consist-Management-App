import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Initialize ArrayList
        ArrayList<String> bogies = new ArrayList<>();

        // Step 2: Add Passenger Bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Step 3: Display Bogies
        System.out.println("\nAfter Adding Bogies:");
        System.out.println(bogies);

        // Step 4: Remove a Bogie
        bogies.remove("AC Chair");

        // Step 5: Check existence
        boolean exists = bogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper exist? " + exists);

        // Step 6: Final List
        System.out.println("\nFinal Bogie List:");
        System.out.println(bogies);
    }
}