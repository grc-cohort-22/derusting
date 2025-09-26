import java.util.List;
import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable

    // Find the length of the string

    // Concatenate (add) two strings together and reassign the result

    // Find the value of the character at index 3

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)

    // Iterate over the characters of the string, printing each one on a separate line

    // Create an ArrayList of Strings and assign it to a variable

    // Add multiple strings to the List (OK to do one-by-one)

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop

    // Check whether two strings are equal

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
    String name = "Rumplestiltskin";

    System.out.println(name.length());

    name += " sucks";

    System.out.println(name.charAt(3));

    System.out.println(name.contentEquals("abc"));

    for (char letter : name.toCharArray()){
      System.out.println(letter);
    }

    List<String> listString = new ArrayList<>();
    listString.add("falihgaiegh");
    listString.add("qiwueptioew");
    listString.add("cxnmvzxmcvn");

    String longString = listString.toArray().toString();

    System.out.println(longString == name);
  }
}
