import java.util.ArrayList;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> x = new ArrayList<>();
    List<String> y = x;
    // Add 3 elements to the list (OK to do one-by-one)
    y.add("abc");
    y.add("def");
    y.add("ghi");
    // Print the element at index 1
    System.out.println(y.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    y.set(1,"jkl");
    System.out.println(y);
    // Insert a new element at index 0 (the length of the list will change)
    y.addFirst("mno");
    // Check whether the list contains a certain string
    if (y.contains("mno")) {
      System.out.println("true");
    }
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i>y.size(); i++) {
      System.out.println("Index: " + i);
      System.out.println("Value: " + y.get(i));
    }
    // Sort the list using the Collections library
    y.sort(null);
    System.out.println(y);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String letters : y) {
      System.out.println(letters + "\n"); // I think this is what on a second line means?
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