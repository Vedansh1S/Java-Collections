package map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Set {
    public static void main(String[] args) {
        Map<String, Integer> examScores = new TreeMap<>();

        // Add scores. Note the unsorted insertion order.
        examScores.put("Science", 88);
        examScores.put("Math", 95);
        examScores.put("English", 91);

        // The TreeMap automatically sorts the entries by key
        System.out.println("\n-> Sorted Exam Scores: " + examScores);

        // Access a value
        System.out.println("\n-> Math Score: " + examScores.get("Math"));
        System.out.println();

        for (Map.Entry<String,Integer> scores : examScores.entrySet()){
            System.out.println("-> The key is: " + scores.getKey() + " and the respective value is " + scores.getValue());
        }
        System.out.println();
    }
}
