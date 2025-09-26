import java.util.ArrayList;
import java.util.Collections;
public class ListPractice {

  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> strings = new ArrayList<String>();

    // Add 3 elements to the list (OK to do one-by-one)
    strings.add("Hey");
    strings.add("hey2");
    strings.add("whats up");

    // Print the element at index 1
    System.out.println(strings.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    strings.set(1, "new value");
    System.out.println(strings.get(1));

    // Insert a new element at index 0 (the length of the list will change)
    strings.add(0, "even newer value");
    System.out.println(strings.get(0));


    // Check whether the list contains a certain string
    if(strings.indexOf("new value") >= 0) {
      System.out.println("Found.");
    } else {
      System.out.println("Not found.");
    }

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < strings.size(); i++) {
      System.out.println(i + strings.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(strings);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for(String str : strings) {
      System.out.println(str);
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