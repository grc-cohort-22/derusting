import java.util.Arrays;
import java.util.ArrayList;
public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Chariot";
    // Find the length of the string
    System.out.println(word.length());
    System.out.println();
    // Concatenate (add) two strings together and reassign the result
    String first = "Number";
    String second = "Two";
    String firstSecond = first+second;
    System.out.println(firstSecond);
    System.out.println();
    // Find the value of the character at index 3
    System.out.println(word.charAt(3));
    System.out.println();
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    String Alphabet = "abc";
    String noABC = "s";
    if (Alphabet.contains("abc")) {
      System.out.println("Alphabet contains \"abc\"");
    }

    if (noABC.contains("abc")) {
      System.out.println("Alphabet contains \"abc\"");
    } else{
      System.out.println("noABC does not contain \"abc\"");
    }
    System.out.println();
    // Iterate over the characters of the string, printing each one on a separate line
    String dessert = "macaron";
    for (int i = 0; i < dessert.length(); i++) {
      System.out.println(dessert.charAt(i));
    }
    System.out.println();
    // Create an ArrayList of Strings and assign it to a variable 
    // ArrayList<String> recipe = new ArrayList<String>(Arrays.asList("cheese","sugar","flour","egg whites"));
    ArrayList<String> recipe = new ArrayList<String>();
    System.out.println();
    // Add multiple strings to the List (OK to do one-by-one)
    recipe.add("cheese");
    recipe.add("sugar");
    recipe.add("flour");
    recipe.add("egg whites");
    System.out.println();
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    ArrayList<String> recipeMixed = new ArrayList<String>(Arrays.asList("cheese","sugar","flour","egg whites"));
    System.out.println(recipeMixed);
    System.out.println();
    // Check whether two strings are equal
    if(recipeMixed.get(0).equals(recipeMixed.get(1))){
      System.out.println("Same ingredient");
    }else{
      System.out.println("Not the same");
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
