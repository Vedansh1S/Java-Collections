package collections;

import java.util.*;

public class QueueOperations {
    public static void main(String[] args) {

        // 1. Create Queue
        Queue<Integer> queue = new LinkedList<>();

        // 2. Enqueue (add)
        queue.add(10); // throws exception if full
        queue.offer(20); // safe version (returns false if fails)
        queue.offer(30); // safe version (returns false if fails)
        queue.offer(40); // safe version (returns false if fails)
        queue.offer(50); // safe version (returns false if fails)

        // 3. Dequeue (remove)
        int r1 = queue.remove(); // throws exception if empty
        int r2 = queue.poll(); // safe version (returns null if empty)

        // 4. Peek (head of queue)
        int peek1 = queue.element(); // throws exception if empty
        Integer peek2 = queue.peek(); // returns null if empty

        // 5. Size & empty
        int size = queue.size();
        boolean empty = queue.isEmpty();

        // 6. Iterate through queue
        for (int x : queue)
            System.out.println(x);
        for (int x1 : queue) {
            System.out.println(x1);
        }

        Iterator<Integer> it2 = queue.iterator();
        while (it2.hasNext()) {
            Integer x = it2.next();
            System.out.println(x);
        }

         // 7. Clear queue
         queue.clear();
    }
}
