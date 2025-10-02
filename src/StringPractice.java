import java.util.ArrayList;
public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String x = "12345";
    // Find the length of the string
    System.out.println(x.length());
    // Concatenate (add) two strings together and reassign the result
    x = x+"abcde";
    System.out.println(x);
    // Find the value of the character at index 3
    System.out.println(x.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(x.contains("abc"));
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i<x.length(); i++) {
      System.out.println(x.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> y = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    y.add("abc");
    y.add("def");
    y.add("ghi");
    y.add("jkl");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(y.toString());
    // Check whether two strings are equal
    System.out.println(y.get(0).equals(y.get(1)));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
