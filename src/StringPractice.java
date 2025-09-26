import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String fiveCharacterString = "Tests";

    // Find the length of the string
    System.out.println(fiveCharacterString.length());

    // Concatenate (add) two strings together and reassign the result
    String stringOne = "String1";
    String stringTwo = "String2";
    stringOne = stringOne.concat(stringTwo);
    System.out.println(stringOne);

    // Find the value of the character at index 3
    System.out.println(fiveCharacterString.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(fiveCharacterString.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < fiveCharacterString.length(); i++) {
      System.out.println(fiveCharacterString.charAt(i) + " ");
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> arrayOfStrings = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    arrayOfStrings.add("string1");
    arrayOfStrings.add("string2");
    arrayOfStrings.add("String3");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(arrayOfStrings.toString());

    // Check whether two strings are equal
    if(stringOne.equals(stringTwo)) {
      System.out.println("equal");
    } else {
      System.out.println("Not equal.");
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
