import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String fruit = "banana";

    // Find the length of the string
    int fruitLength = fruit.length();
    System.out.println(fruitLength);

    // Concatenate (add) two strings together and reassign the result
    String drink = "milk";
    String result = fruit + drink;
    System.out.println(result);

    // Find the value of the character at index 3
    String letter = result.substring(3,4);
    System.out.println(letter);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println("Does result have milk? " + result.contains("milk"));

    // Iterate over the characters of the string, printing each one on a separate line
    for(char c : result.toCharArray()){
      System.out.println(c);
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> myList = new ArrayList<String>();


    // Add multiple strings to the List (OK to do one-by-one)
    myList.add("Leo");
myList.add("Will");
myList.add("Joshua");
myList.add("Jadon");


    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String combinedString = String.join(",", myList);

    System.out.println(combinedString);
    // Check whether two strings are equal
    System.err.println("Does Leo equal to Will? " + "Leo".equals("Will"));
    
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
