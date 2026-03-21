import java.util.ArrayList;
public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> myList = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    myList.add("First");
    myList.add("Second");
    myList.add("Third");

    // Print the element at index 1
    System.out.println(myList.get(1)); // Getting the element at index 1

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    myList.set(1, "replaced value"); // Replacing the element at index 1 with .set()

    // Insert a new element at index 0 (the length of the list will change)
    myList.add(0, "new value here"); // Inserting a new element

    // Check whether the list contains a certain string
    boolean containsString = myList.contains("First"); // Checking if the list contains "First"
    System.out.println("List contains a string: " + containsString);

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < myList.size(); i++){
      System.out.println("Index: " + i + "\n" + "Value: " + myList.get(i));
    }

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
  }
}