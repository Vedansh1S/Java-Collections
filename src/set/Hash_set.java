package set;
import java.util.Set; 
import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();

        tags.add("Java");
        tags.add("Programming");
        tags.add("Collections");

        boolean isAdded = tags.add("Java"); 
        
        System.out.println("\nWas the duplicate 'Java' tag added? " + isAdded); // false
        System.out.println("Set of tags: " + tags); // Note: Order is not guaranteed

        boolean hasProgramming = tags.contains("Programming");
        System.out.println("Does the set contain 'Programming'? " + hasProgramming); // true

        tags.remove("Collections");
        System.out.println("Set after removing 'Collections': " + tags);
    }
}
