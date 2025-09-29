import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {

  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> myStrings = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    myStrings.add("I love dogs!");
    myStrings.add("Hey there.");
    myStrings.add("Avengers, assemble.");

    // Print the element at index 1
    System.out.println(myStrings.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    myStrings.set(1, "Woah, I'm different!");

    // Insert a new element at index 0 (the length of the list will change)
    myStrings.addFirst("New guy here...");

    // Check whether the list contains a certain string
    // EXPECTED: TRUE
    System.out.println("Contains new guy?: " + myStrings.contains("New guy here..."));

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < myStrings.size(); i++) {
      System.out.println("[" + myStrings.get(i) + "]" + " at " + "index " + i);
    }

    // Sort the list using the Collections library
    Collections.sort(myStrings);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    System.out.println();
    for (String x : myStrings) {
      System.out.println(x);
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