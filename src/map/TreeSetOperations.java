package map;

import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {

        // 1. Create TreeSet (natural sorting)
        TreeSet<Integer> set = new TreeSet<>();

        // 2. Add elements
        set.add(10);
        set.add(5);
        set.add(20);

        // 3. Remove element
        set.remove(10);

        // 4. Check contains
        boolean exists = set.contains(20);

        // 5. Size & empty
        int size = set.size();
        boolean empty = set.isEmpty();

        // 6. Get first and last
        int first = set.first();
        int last = set.last();

        // 7. Lower, Higher, Floor, Ceiling
        Integer lower = set.lower(15); // < 15
        Integer higher = set.higher(15); // > 15
        Integer floor = set.floor(15); // ≤ 15
        Integer ceil = set.ceiling(15); // ≥ 15

        // 8. Iterate
        for (int x : set)
            System.out.println(x);

        // 9. Reverse iteration
        Iterator<Integer> rev = set.descendingIterator();
        while (rev.hasNext())
            System.out.println(rev.next());

        // 10. Subset view
        SortedSet<Integer> subset = set.subSet(5, 20); // from 5 to 19

        // 11. HeadSet and TailSet
        SortedSet<Integer> head = set.headSet(10); // <10
        SortedSet<Integer> tail = set.tailSet(10); // >=10

        // 12. Clear
        set.clear();

        // 13. TreeSet with custom comparator
        TreeSet<String> names = new TreeSet<>((a, b) -> b.compareTo(a)); // descending
        names.add("Vedansh");
        names.add("Aman");
        names.add("Kunal");

        // 14. Convert to ArrayList
        ArrayList<String> list = new ArrayList<>(names);

        // 15. Convert from ArrayList
        ArrayList<Integer> arr = new ArrayList<>(List.of(30, 10, 20));
        TreeSet<Integer> set2 = new TreeSet<>(arr);
    }
}
