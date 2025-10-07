
import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String this5Chars = "Lovely";
    // Find the length of the string
    System.out.println(this5Chars.length());
    // Concatenate (add) two strings together and reassign the result
    String thing1 = "Wow";
    String thing2 = "zers";

    this5Chars = (thing1 + thing2 + "!");
    System.out.println(this5Chars);
    // Find the value of the character at index 3
    char val3 = this5Chars.charAt(3);
    System.out.println("Val 3: " + val3);
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if (this5Chars.contains("owz")) {
      System.out.println("Contains owz");
    }
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < this5Chars.length(); i++) {
      char character = this5Chars.charAt(i);
      System.out.println(character);
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> stringList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("TH");
    stringList.add("LIFE LIVE LOVE");
    stringList.add("Live laugh love actually");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println("Joined String! " + String.join(", " + stringList));
    // Check whether two strings are equal
    String string1 = "Who";
    String string2 = "Who";
    if (string1 == string2){
      System.out.println("Equal");
    }
    else {
      System.out.println("Not equal");
    }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
