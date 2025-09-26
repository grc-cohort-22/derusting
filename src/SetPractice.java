import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    HashSet<String> fruits = new HashSet<>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    fruits.add("Kiwi");
    fruits.add("Blackberry");
    fruits.add("Tomato");
    // Check whether the Set contains a given String

    System.out.println("Does fruit set contain Banana?" + fruits.contains("Banana"));
    // Remove an element from the Set

    fruits.remove("kiwi");
    // Get the size of the Set
    int sizeOfSet = fruits.size();
    System.out.println(sizeOfSet);
    // Iterate over the elements of the Set, printing each one on a separate line
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

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
