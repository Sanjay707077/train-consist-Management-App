import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashMap
        HashMap<String, Integer> bogieMap = new HashMap<>();

        // Step 2: Insert Bogie-Capacity Data
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 50);
        bogieMap.put("First Class", 30);

        // Step 3: Display Mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}