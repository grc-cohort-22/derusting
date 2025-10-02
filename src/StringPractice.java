import java.util.ArrayList;  

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String[] fruits = {"Apple", "Mango", "Pineapple", "Kiwi", "Watermelon"};
    // Find the length of the string
    for ( String fruit : fruits) {
      System.out.println("The length of " + fruit + " is " + fruit.length());
    }
    // Concatenate (add) two strings together and reassign the result
    String joinString = String.join(", ", fruits);
    System.out.println(joinString);
    // Find the value of the character at index 3
    String fruit = fruits[0];
    System.out.println("The character at index 3 of " + fruit + " is " + fruit.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    for (String fruit : fruits) {
      if (fruit.contains("abc")) {
        System.out.println("The string contains abc");
      } else {
        System.out.println("The string does not contain abc");
      }
    }
  
    // Iterate over the characters of the string, printing each one on a separate line
    for (String fruit : fruits)  {
      for (int i = 0; i < fruit.length(); i++) {
        System.out.println(fruit.charAt(i));
      }
}
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> List = new ArrayList<String>();
    // Add multiple strings to the List (OK to do one-by-one)
  List.add("Apple");
  List.add("Mango");
  List.add("Banana");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(", ", List);
    System.out.println(joinedString);

    // Check whether two strings are equal
    if (List.get(0).equals("Apple")) {
      System.out.println("The first string is Apple");
    } else {
      System.out.println("The first string is not Apple");
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
