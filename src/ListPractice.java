import java.util.List;
import java.util.ArrayList;

public class ListPractice {
  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List

    // Add 3 elements to the list (OK to do one-by-one)

    // Print the element at index 1

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)

    // Insert a new element at index 0 (the length of the list will change)

    // Check whether the list contains a certain string

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line

    // Sort the list using the Collections library

    // Iterate over the list using a for-each loop
    // Print each value on a second line

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
    List<String> stringList = new ArrayList<>();
    stringList.add("Ryan");
    stringList.add("Hannah");
    stringList.add("Emmy");

    System.out.println(stringList.get(1));
    
    stringList.set(1, "Shannon");

    stringList.add(0, "Abby");

    System.out.println(stringList.contains("Abby"));

    for (int i = 0; i < stringList.size(); i++){
      System.out.println("index " + i + ": " + stringList.get(i));
    }

    stringList.sort(null);

    for (String name : stringList){
      System.out.println(name);
    }
  }
}