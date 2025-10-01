import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> words = new ArrayList<>();
    

    // Add 3 elements to the list (OK to do one-by-one)
    words.add("Marvel Comics");
    words.add("Detective Comics");
    words.add("Image Comics");
    // Print the element at index 1
    System.out.println(words.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    words.set(1, "Dark Horse Comics");
    System.out.println(words.get(1));

    // Insert a new element at index 0 (the length of the list will change)
    words.add(0, "IDW Publishing");

    // Check whether the list contains a certain string
    System.out.println(words.contains("Dark Horse Comics"));

    // Iterate over the list using a traditional for-loop.
    for (int i = 0; i < words.size(); i++) { 

    // Print each index and value on a separate line
      System.out.println(words.get(i));
    }
    // Sort the list using the Collections library
    System.out.println("before sort: " + words);
    Collections.sort(words);
    System.out.println("after sort: " + words);

    // Iterate over the list using a for-each loop
    for (String word : words) {

    // Print each value on a second line
      System.out.println(word);
    }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}