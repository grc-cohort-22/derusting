import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListPractice {

  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List

    ArrayList<String> daysOfTheWeek = new ArrayList<String>();

    // Add 3 elements to the list (OK to do one-by-one)
    daysOfTheWeek.add("Sunday");
    daysOfTheWeek.add("Monday");
    daysOfTheWeek.add("Tusday");

    // Print the element at index 1

    System.out.println(daysOfTheWeek.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    daysOfTheWeek.set(1, "Saturday");

    // Insert a new element at index 0 (the length of the list will change)
    daysOfTheWeek.add(0, "Fryday");
    // Check whether the list contains a certain string
      boolean found = false;
     if daysOfTheWeek.contains("Monday"){
      found = true;
      
     }else{
      found = false
     }
     System.out.println(found);
    // Iterate over the list using a traditional for-loop.
    for(int i = 0; i < daysOfTheWeek.size(); i++){
      
    // Print each index and value on a separate line
    System.out.println(daysOfTheWeek.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(daysOfTheWeek);

    // Iterate over the list using a for-each loop
    for(String i : daysOfTheWeek){
          // Print each value on a second line
      System.out.println(i);
    }


    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to
     * iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need
     * the
     * index values a for-each loop is cleaner.
     */
  }
}