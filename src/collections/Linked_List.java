package collections;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Cat");
        linkedList.add("Dog");

        System.out.println(linkedList); 

        // New LinkedList example
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Bohemian Rhapsody");
        playlist.add("Stairway to Heaven");
        playlist.add("Hotel California");

        System.out.println("Initial Playlist: " + playlist);

        playlist.addFirst("Imagine");
        System.out.println("After adding to the front: " + playlist);

        String removedSong = playlist.removeFirst();
        System.out.println("Removed song: " + removedSong);
        System.out.println("Current Playlist: " + playlist);
    }
}
