package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_tut {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        System.out.println(arrayList);

        // New ArrayList example
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy groceries");
        tasks.add("Walk the dog");
        tasks.add("Finish homework");

        System.out.println("My To-Do List: " + tasks);

        String firstTask = tasks.get(0);

        System.out.println("First thing to do: " + firstTask);
        System.out.println("Number of tasks: " + tasks.size());
    }
}
