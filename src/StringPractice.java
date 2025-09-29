import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myString = "Ahmed";

    // Find the length of the string
    System.out.println("String Length: " + myString.length());

    // Concatenate (add) two strings together and reassign the result
    myString = (myString + "Heythere!");

    // Find the value of the character at index 3
    System.out.println("Value at index three: " + myString.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println("Contains Ahm?: " + myString.contains("Ahm"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < myString.length(); i++) {
      System.out.println(myString.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> myArray = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    myArray.add("Wuzzup");
    myArray.add("Hello yo!");
    myArray.add("I like cheese.");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String test = String.join(", ", myArray);
    System.out.println(test);

    // Check whether two strings are equal
    System.out.println("They equal?: " + myArray.get(0).equals(myArray.get(1)));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
