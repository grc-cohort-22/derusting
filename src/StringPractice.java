import java.util.List;
import java.util.ArrayList;
public class StringPractice { 
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String string = "Joseph";
    // Find the length of the string
    System.out.println(string.length());
    // Concatenate (add) two strings together and reassign the result
    string += " John";
    System.out.println(string);
    // Find the value of the character at index 3
    System.out.println(string.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(string.contains("ohn"));
    // Iterate over the characters of the string, printing each one on a separate line
    for(char c : string.toCharArray()) {
      System.out.println(c);
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> list = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    list.add("Doe");
    list.add("Flower");
    list.add("Allen");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(list.toString());
    // Check whether two strings are equal
    System.out.println(string.equals(list.get(0)));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
