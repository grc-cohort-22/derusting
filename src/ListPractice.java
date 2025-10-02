import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
     List<String>list = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    list.add("Ebtisam");
    list.add("Manar");
    list.add("Afnan");
    list.set(1,"Semah");
    list.add(0,"Abdulaziz");
    // Print the element at index 1
   System.out.println(list.get(1));
    // Replace the element at index 1 with a new value
    //I used the set method to replace the list with new value.
    System.out.println(list);
    // (Do not insert a new value. The length of the list should not change)

    // Insert a new element at index 0 (the length of the list will change)
    // I used add method to add the element.
    // Check whether the list contains a certain string
    System.out.println("Contains a certain string manar :" + list.contains("manar"));
    
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i =0; i<list.size(); i++){
      System.out.println( ( "index:" +"["+ i+"]"  )+list.get(i) );
    }


    // Sort the list using the Collections library
   Collections.sort(list);
   System.out.println(list);

   
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String i: list){
      System.out.println(i);
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