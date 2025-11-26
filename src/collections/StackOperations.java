package collections;

import java.util.*;

public class StackOperations {
    public static void main(String[] args) {

        // 1. Create Stack
        Stack<Integer> stack = new Stack<>();

        // 2. Push element
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // 3. Pop element (removes top)
        int top = stack.pop(); // returns 30

        // 4. Peek (just see top)
        int peekValue = stack.peek(); // returns 20

        // 5. Check if empty
        boolean empty = stack.isEmpty();

        // 6. Size
        int size = stack.size();

        // 7. Search (1-based position from top)
        int position = stack.search(10); // 2

        // 8. Iterate (not typical)
        for (Integer x : stack)
            System.out.println(x);
        for (Integer x : stack) {
            System.out.println(x);
        }

        // 9. Clear stack
        stack.clear();

        // 10. Stack using Deque (Most recommended in real code!)
        Deque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.pop();
        st.peek();

        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            System.out.println(x);
            // it.remove(); // safe removal if needed
        }
    }
}
