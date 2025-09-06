package set;
import java.util.TreeSet;
import java.util.Set;

public class Tree_Set {
    public static void main(String[] args) {
        // Example 1: TreeSet of Strings
        Set<String> tags = new TreeSet<>();

        tags.add("Java");
        tags.add("Programming");
        tags.add("Collections");
        tags.add("Python");
        tags.add("C++");

        boolean isAdded = tags.add("Java"); // This will be ignored

        System.out.println("\n-> Was the duplicate 'Java' tag added? " + isAdded); // false
        System.out.println("\n-> Set of tags: " + tags); 

        boolean hasProgramming = tags.contains("Programming");
        System.out.println("\n-> Does the set contain 'Programming'? " + hasProgramming); 

        tags.remove("Collections");
        System.out.println("\n-> Set after removing 'Collections': " + tags);

        // Example 2: TreeSet of Integers
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(54);
        numbers.add(12);
        numbers.add(89);
        numbers.add(37);

        numbers.add(12);

        System.out.println("\n-> Sorted TreeSet: " + numbers);
    }

}
