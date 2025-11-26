package iterators;

import java.util.*;

public class AdvanceIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext())
            System.out.println(it.next()); // forward
        while (it.hasPrevious())
            System.out.println(it.previous()); // backward

        // Add & Remove safely
        //You're calling it.add(100) and then immediately calling it.remove(). According to the Java documentation, after calling add(), a remove operation cannot be performed until next() or previous() is called again. 
        // That is why you get an IllegalStateException:> remove() can only be called once per call to next() or previous(), and only if neither add() nor remove() have been called after the last call to next or previous.
        // Note: Order is important—do not call add() before remove(), or you will get the exception!

        while (it.hasNext()) {
            Integer val = it.next();
            if (val == 2) {
                it.add(100); // before 3
                // add remove -> not good
                // remove add -> good to go
            }
        }
        it.remove();

        System.out.println(list);

        while (it.hasNext())
            System.out.println(it.next()); // Not execute since we are at the last index.

        for (Integer item : list) {
            System.out.println(item);     // ONLY reading, cannot safely remove
        }
        // -----------------------------------------------

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            Map.Entry<String, Integer> e = itMap.next();
            if (e.getValue() < 15)
                itMap.remove();
        }

    }
}
