package map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        Map<String, Integer> studentScores = new HashMap<>();

        // Add key-value pairs
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 82);
        studentScores.put("Charlie", 91);

        System.out.println("\nStudent Scores: " + studentScores);

        // Access a value by its key
        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's Score: " + aliceScore);
        System.out.println();


        for (String key : studentScores.keySet()){
            System.out.println("The keys are: " + key);
        }
        System.out.println();

        for (Integer values : studentScores.values()){
            System.out.println("The values are: " + values);
        }

        System.out.println("\nIterating through scores: ");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
