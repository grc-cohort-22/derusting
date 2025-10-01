import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String firstName = "Xavier";
    // Find the length of the string
    int nameLength = firstName.length();
    System.out.println("Length of name: " + nameLength);

    // Concatenate (add) two strings together and reassign the result
    String lastName = "Lewis";
    
    String fullName = firstName + " " + lastName;

    System.out.println(fullName);

    // Find the value of the character at index 3
    char c = fullName.charAt(3);
    System.out.println("The value of the character at index 3 is: " + c);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(fullName.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < lastName.length(); i++) {
      char w = lastName.charAt(i);
      System.out.println("Character at index " + i + " is " + w);
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> words = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    words.add("Apple");
    words.add("Banana");
    words.add("Orange");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedStrings = String.join("," , words);
    System.out.println(joinedStrings);

    // Check whether two strings are equal
    if (firstName.equals(lastName)) {
      System.out.println("equal");
    } else {
      System.out.println("not equal");
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
