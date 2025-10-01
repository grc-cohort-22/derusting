import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ListPractice {

  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> strList = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    strList.add("John");
    strList.add("Doe");
    strList.add("Happy");
    // Print the element at index 1
    System.out.println(strList.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    strList.set(1, "Sad");
    // Insert a new element at index 0 (the length of the list will change)
    strList.add(0, "Angry");
    for(String s : strList) {
      System.out.print(s + " ");
    }
    System.out.println();
    // Check whether the list contains a certain string
    if(strList.contains("Sad")) {
      System.out.println("True");
    }
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < strList.size(); i++) {
      System.out.println("Index: " + i);
      System.out.println(strList.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(strList);
    // Iterate over the list using a for-each loop
    for(String s : strList) {
      System.out.print(s + " ");
    }
    System.out.println();
    // Print each value on a second line
    for(String s : strList) {
      System.out.println(s);
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