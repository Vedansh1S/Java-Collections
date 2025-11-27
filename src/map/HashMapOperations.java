package map;

import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {

        // 1. Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 2. Put key-value pairs
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        // 3. Get value
        int val = map.get("A");

        // 4. Check if key or value exists
        boolean kExists = map.containsKey("B");
        boolean vExists = map.containsValue(30);

        // 5. Remove
        map.remove("C"); // by key
        map.remove("A", 10); // remove only if key-value matches

        // 6. Replace/update value
        map.replace("B", 25);
        map.put("B", 50); // also updates

        // 7. Size
        int size = map.size();

        // 8. Check empty
        boolean empty = map.isEmpty();

        // 9. Iterate entries
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        // 10. Iterate keys
        for (String key : map.keySet())
            System.out.println(key);

        // 11. Iterate values
        for (Integer v : map.values())
            System.out.println(v);

        // 12. Use getOrDefault
        int val2 = map.getOrDefault("D", -1);

        // 13. PutIfAbsent
        map.putIfAbsent("E", 100);

        // 14. Merge values
        map.merge("E", 50, Integer::sum);

        // 15. Compute value
        map.compute("E", (k, oldVal) -> oldVal + 20);

        // 16. Compute if absent
        map.computeIfAbsent("F", k -> 200);

        // 17. Compute if present
        map.computeIfPresent("F", (k, oldVal) -> oldVal * 2);

        // 18. Convert Keys to List
        List<String> keys = new ArrayList<>(map.keySet());

        // 19. Convert Values to List
        List<Integer> values = new ArrayList<>(map.values());

        // 20. Clear
        map.clear();

        // 21. HashMap with initial capacity & load factor
        HashMap<String, Integer> customMap = new HashMap<>(50, 0.75f);
    }
}
