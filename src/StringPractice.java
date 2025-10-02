import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String str = "hello";
    // Find the length of the string
    System.out.println(str.length());
    // Concatenate (add) two strings together and reassign the result
    String newStr = str + "Kevin";
    System.out.println(newStr);
    // Find the value of the character at index 3
    System.out.println(str.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(str.contains("abc"));
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i<str.length(); i++){
      System.out.println(str.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> list = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    list.add("my");
    list.add("name");
    list.add("is");
    list.add("Kevin");
    System.out.println(list);
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
      String combinedList = String.join(", ", list);
      System.out.println(combinedList);
    // Check whether two strings are equal
      System.out.println(str.equals(combinedList));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
