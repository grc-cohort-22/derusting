import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> theList = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    theList.add("Thinga");
    theList.add("Thingb");
    theList.add("Thingc");
    // Print the element at index 1
    System.out.println("\nElement at index 1: "+ theList.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    theList.set(1, "Grape");
    System.out.println("After replacing index 1: " + theList);
    // Insert a new element at index 0 (the length of the list will change)
    theList.add("Thing");
    // Check whether the list contains a certain string'
    if (theList.contains("Thing")){
      System.out.println("Thing detected");
    }    
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    int increment = 0;
    for (String n : theList){
      System.out.println("Id: " + increment + " | " + n);
      increment += 1;
    }
    // Sort the list using the Collections library
    Collections.sort(theList);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String options : theList) {
      System.out.println(options);
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