package set;

import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {

        // 1. Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // 2. Add elements
        set.add(10);
        set.add(20);
        set.add(10); // duplicates are ignored

        // 3. Remove element
        set.remove(20);

        // 4. contains()
        boolean exists = set.contains(10);

        // 5. Size & empty
        int size = set.size();
        boolean empty = set.isEmpty();

        // 6. Iterate (Order NOT guaranteed)
        for (int x : set) System.out.println(x);

        // 7. Using Iterator
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) System.out.println(itr.next());

        // 8. Clear
        set.clear();

        // 9. Add all elements from list
        set.addAll(Arrays.asList(5, 2, 8));

        // 10. Remove all elements of another set
        set.removeAll(Set.of(2, 5));

        // 11. Retain only common elements
        set.retainAll(Set.of(8, 10));

        // 12. Convert HashSet -> ArrayList
        ArrayList<Integer> list = new ArrayList<>(set);

        // 13. Convert ArrayList -> HashSet
        HashSet<Integer> set2 = new HashSet<>(list);

        // 14. Clone
        HashSet<Integer> clone = (HashSet<Integer>) set.clone();

        // 15. Ensure capacity (performance optimization)
        HashSet<Integer> hsCustom = new HashSet<>(100, 0.75f);

        // 16. Stream
        List<Integer> result = set.stream().filter(n -> n % 2 == 0).toList();
    }
}
