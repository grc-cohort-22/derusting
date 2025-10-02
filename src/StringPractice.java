import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String a = "fight";
    // Find the length of the string
    System.out.println(a);
    // Concatenate (add) two strings together and reassign the result
    a = a + " me!";
    // Find the value of the character at index 3
    System.out.println(a.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if (a.contains("ight")) {
      System.out.println("Ight found!");
    }
    // Iterate over the characters of the string, printing each one on a separate line
    for (int b = 0; b < a.length(); b++) {
      System.out.println(a.charAt(b));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> c = new ArrayList<String>();
    // Add multiple strings to the List (OK to do one-by-one)
    c.add("VI");
    c.add("IV");
    c.add("XI");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String combined = String.join(",", c);
    System.out.println(combined);
    // Check whether two strings are equal
    System.out.println(a.equals(c));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
