import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create List
        List<Bogie> list = new ArrayList<>();

        // Step 2: Add Bogies
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 30));

        // Step 3: Sort by Capacity
        list.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display Sorted Bogies
        System.out.println("\nSorted Bogies (by Capacity):");

        for (Bogie b : list) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}