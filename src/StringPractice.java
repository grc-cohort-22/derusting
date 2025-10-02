import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String text = "HelloWorld";
    // Find the length of the string
    System.out.println("Length: " + text.length());
    // Concatenate (add) two strings together and reassign the result
    text = text + "123";
    System.out.println("After concatenation: " + text);
    // Find the value of the character at index 3
    System.out.println("Character at index 3: " + text.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string
    // have "abc" in it?)
    System.out.println("Contains 'abc'? " + text.contains("abc"));
    // Iterate over the characters of the string, printing each one on a separate
    // line
    System.out.println("Characters in the string:");
    for (int i = 0; i < text.length(); i++) {
      System.out.println(text.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> words = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    words.add("Apple");
    words.add("Banana");
    words.add("Cherry");
    // Join all of the strings in the list together into a single string separated
    // by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(", ", words);
    System.out.println("Joined list: " + joined);
    // Check whether two strings are equal
    String s1 = "Hello";
    String s2 = "hello";
    System.out.println("s1 equals s2? " + s1.equals(s2));
    System.out.println("s1 equalsIgnoreCase s2? " + s1.equalsIgnoreCase(s2));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
