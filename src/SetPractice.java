import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    HashSet<String> books = new HashSet<>();

    // Add 3 elements to the set
    books.add("To Kill a Mockingbird");
    books.add("The Lord of the Flies");
    books.add("The Lord of the Rings");
    // (It's OK to do it one-by-one)

    // Check whether the Set contains a given String
    books.contains("The Lord of the Flies");

    // Remove an element from the Set
    books.remove("To Kill a Mockingbird");

    // Get the size of the Set
    books.size();

    // Iterate over the elements of the Set, printing each one on a separate line
    for (String i : books) {
      System.out.println(i);

    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different
     * results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a
     * specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
