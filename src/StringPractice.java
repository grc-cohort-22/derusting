import java.util.ArrayList;


public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String message = "relax";

    // Find the length of the string
    System.out.println(message.length());

    // Concatenate (add) two strings together and reassign the result
    message = message + "chilly";
    System.out.println(message);

    // Find the value of the character at index 3
    System.out.println(message.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(message.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < message.length(); i ++){
      System.out.println(message.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> words = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    words.add("mango");
    words.add("berry");
    words.add("cherry");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(",", words);
    System.out.println("\nJoined " + joined);

    // Check whether two strings are equal
    String ios = "hi";
    String andriod = "hi";

    System.out.println( ios.equals(andriod));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
