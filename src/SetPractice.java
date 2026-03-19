import java.util.*;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    HashSet<String> Set = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
      Set.add("a");
      Set.add("b");
      Set.add("c");

    // Check whether the Set contains a given String
      System.out.print("does Set contain a:  ");
      System.out.println(Set.contains("a"));

    // Remove an element from the Set
      System.out.print("before: ");
      System.out.println(Set.toString());
      Set.remove("a");
      System.out.print("after: ");
      System.out.println(Set.toString());


    // Get the size of the Set

      int x = Set.size();
      System.out.printf("The size of the set is %d", x);
      System.out.println();
    // Iterate over the elements of the Set, printing each one on a separate line

      System.out.println("-------------");
      for (String s : Set) {
        System.out.println(s);
      }
      System.out.println("-------------");
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
