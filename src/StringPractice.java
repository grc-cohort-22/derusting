import java.util.List;
import java.util.ArrayList;
public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable

    // Find the length of the string

    // Concatenate (add) two strings together and reassign the result

    // Find the value of the character at index 3

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)

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

    String word = "words";

    System.out.println(word.length());
     
    System.out.println(word = word + "word");

    System.out.println(word.charAt(3));

    if(word.substring(0).contains("word")){
      System.out.println("true");
    }else{
      System.out.println("false");
    }

    for(int i = 0; i < word.length(); i++){
      System.out.println(word.charAt(i));
    }

    List<String> words = new ArrayList<>();

    for(int i = 0; i < 3; i++){
      String neww = "a";
      for(int f = 0; f < i; f++){
        neww += "a";
      }
      words.add(neww);
    }

    System.out.println(words);

    String newWord = "";

    for(int i = 0; i < words.size(); i++){
      newWord += words.get(i) + ", ";
    }

    System.out.println(newWord);

    System.out.println(word.equals(newWord));
  }
}
