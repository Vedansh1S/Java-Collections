package collections;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Add elements
        list.add(10); // at end
        list.add(20);
        list.add(30);
        list.add(1, 15); // at index

        // 3. Get element
        int val = list.get(2);

        // 4. Set element (modify)
        list.set(1, 25);

        // 5. Remove element
        list.remove(0); // by index
        list.remove(Integer.valueOf(30)); // by value

        // 6. Size of list
        int size = list.size();

        // 7. Check if element exists
        boolean contains = list.contains(20);

        // 8. Check if empty
        boolean empty = list.isEmpty();

        // 9. Iterate List
        for (int x : list)
            System.out.println(x); // for-each
        list.forEach(System.out::println); // lambda
        Iterator<Integer> itr = list.iterator(); // using iterator
        while (itr.hasNext())
            System.out.println(itr.next());

        // 10. Clear list
        list.clear();

        // 11. Add all elements of another list
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 2, 8));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 7));
        list1.addAll(list2);

        // 12. Sorting
        Collections.sort(list1); // ascending
        list1.sort(Collections.reverseOrder()); // descending

        // 13. Reverse list
        Collections.reverse(list1);

        // 14. Convert ArrayList to Array
        Integer[] arr = list1.toArray(new Integer[0]);

        // 15. Convert Array to ArrayList
        Integer[] arr2 = { 10, 20, 30 };
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr2));

        // 16. Clone ArrayList (shallow copy)
        ArrayList<Integer> listClone = (ArrayList<Integer>) list1.clone();

        // 17. Create subList (view only)
        List<Integer> sub = list1.subList(1, 3); // from index 1 to 2

        // 18. Remove all elements of another list
        list1.removeAll(list2);

        // 19. Retain only common elements
        list1.retainAll(list2);

        // 20. Sort using custom comparator
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Vedansh", "Kunal", "Shivansh"));
        names.sort((a, b) -> b.length() - a.length()); // descending by length

        // 21. Stream operations
        List<Integer> even = list3.stream().filter(n -> n % 2 == 0).toList();

        // 22. Ensure capacity
        list.ensureCapacity(100);

        // 23. Trim to size
        list.trimToSize();

        // 24. Replace all elements
        list3.replaceAll(n -> n * 2); // multiply each element by 2

        // 25. Remove via condition
        list3.removeIf(n -> n > 20);

        // 26. Index of element
        int idx = list3.indexOf(10); // first occurrence
        int lastIdx = list3.lastIndexOf(10); // last occurrence

        // 27. ForEach with index
        for (int i = 0; i < list3.size(); i++) {
            System.out.println("Index " + i + ": " + list3.get(i));
        }

        // 28. Convert to LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(list3);
    }
}
