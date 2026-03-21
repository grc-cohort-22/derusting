import java.util.ArrayList;

public class StringPractice {  
  
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String fiveLetterString = "Hello";

    // Find the length of the string
    fiveLetterString.length();


    // Concatenate (add) two strings together and reassign the result
    String newString = fiveLetterString + "World"; // Concatenating two strings together

    // Find the value of the character at index 3
    char charAtIndex3 = fiveLetterString.charAt(3); // Getting the character at index 3

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean checkSubstring = fiveLetterString.contains("llo");

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < fiveLetterString.length(); i++){
      System.out.println(fiveLetterString.charAt(i)); // using charAt to print each index
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> myArrayList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    myArrayList.add("First");
    myArrayList.add("Second");
    myArrayList.add("Third");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(",", myArrayList); // Joining the strings in the list together with commas using .join();

    // Check whether two strings are equal

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
