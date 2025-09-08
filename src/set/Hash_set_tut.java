package set;

import java.util.Set;
import java.util.HashSet;

public class hashset_tut {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();

        tags.add("Java");
        tags.add("Programming");
        tags.add("Collections");
        tags.add("Python");
            tags.add("C++");

        boolean isAdded = tags.add("Java");

        System.out.println("\n-> Was the duplicate 'Java' tag added? " + isAdded); // false
        System.out.println("\n-> Set of tags: " + tags); // Note: Order is not guaranteed

        boolean hasProgramming = tags.contains("Programming");
        System.out.println("\n-> Does the set contain 'Programming'? " + hasProgramming); // true

        tags.remove("Collections");
        System.out.println("\n-> Set after removing 'Collections': " + tags);
        System.out.println();

        for (String tag : tags) {
            System.out.println("Tag: " + tag);
        }
    }
}
