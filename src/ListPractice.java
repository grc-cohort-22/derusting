import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> fruits = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    fruits.add("mango");
    fruits.add("kiwi");
    fruits.add("passionfruit");

    // Print the element at index 1
    System.out.println(fruits.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    fruits.set(1, "berry");

    // Insert a new element at index 0 (the length of the list will change)
    fruits.add(0, "banana");

    // Check whether the list contains a certain string
    boolean hasKiwi = fruits.contains("kiwi");
    System.out.println(hasKiwi);

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < fruits.size(); i ++){
      System.out.println("index" + i + fruits.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(fruits);


    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for(String fruit : fruits){
      System.out.println(fruit);
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