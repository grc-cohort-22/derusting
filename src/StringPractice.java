import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String message = "Struggle Coding";
    System.out.println(message);
    // Find the length of the string
    System.out.println(message.length());

    // Concatenate (add) two strings together and reassign the result
     String message1= "Happy";
     String message2= "Friday!";
     String message3 =message1 + message2;
     System.out.println(message3);
    // Find the value of the character at index 3

    System.out.println(message3.indexOf("p"));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(message3.contains("abc"));
    // Iterate over the characters of the string, printing each one on a separate line
   x = message + message3;
    System.out.println(x);
    
      
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> colors = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    colors.add ("Red");
     colors.add ("Brown");

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
