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
  }
}
