package collections;

import java.util.Stack;

public class Stack_tut {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);

        System.out.println("The popped element is: " + stack.pop());

        // New Stack example
        Stack<String> history = new Stack<>();

        history.push("google.com");
        history.push("wikipedia.org");
        history.push("github.com");

        System.out.println("\nCurrent browser history: " + history);
        System.out.println("Current page is: " + history.peek());

        String lastVisitedPage = history.pop();

        System.out.println("\nPressed the back button...");

        System.out.println("Went back from: " + lastVisitedPage);
        System.out.println("Now on page: " + history.peek());
        System.out.println("\nIs history empty? " + history.empty());
    }
}
