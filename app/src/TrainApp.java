import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashSet
        HashSet<String> bogieIDs = new HashSet<>();

        // Step 2: Add Bogie IDs (with duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Step 3: Display Unique IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);
    }
}