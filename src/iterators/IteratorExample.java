package iterators;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Elderberry");
        fruits.add("Date");

        Iterator<String> iterator = fruits.iterator();

        System.out.println("\n-> Iterating through the list of fruits:\n");
        while (iterator.hasNext()) {

            String fruit = iterator.next();
            System.out.println("-> " + fruit);

            if (fruit.equals("Banana")) {
                iterator.remove(); // Removes "Banana" from the original list
            }
        }
        System.out.println("\n-> List after removing 'Banana': " + fruits);
        System.out.println();
    }
}
