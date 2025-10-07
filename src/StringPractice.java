import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String color = "green";

    // Find the length of the string
    System.out.println(color.length());
    // Concatenate (add) two strings together and reassign the result
    color = color + " blue";

    // Find the value of the character at index 3
    System.out.println(color.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if(color.substring(0, 3).equals("gre")){
      System.out.println("The string starts with gre");
    }

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < color.length(); i++){
      System.out.println(color.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> list = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    list.add("red");
    list.add("green");
    list.add("blue");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(String.join(", ", list));

    // Check whether two strings are equal
    if(list.get(0).equals("red")){
      System.out.println("it equals red");
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
