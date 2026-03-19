import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String s = "abcde";

    // Find the length of the string
    System.out.printf("String size: %d", s.length());
    System.out.println();

    // Concatenate (add) two strings together and reassign the result
    String a = "this is a ";
    String b = "concatinated string";
    String c = a+b;
    System.out.println(a+b);

    // Find the value of the character at index 3
    System.out.println("character at index 3: " + s.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.printf("does the string %s contain abc: ", s);
    System.out.print(s.contains("abc"));
    System.out.println();

    // Iterate over the characters of the string, printing each one on a separate line
    for (Character ch : s.toCharArray()) {
      System.out.println(ch);
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> _strings = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    _strings.add(a);
    _strings.add(b);
    _strings.add(c);
    _strings.add(s);

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String z = String.join(", ", _strings);
    System.out.println(z);
    
    // Check whether two strings are equal
    System.out.println(a.equals(b)); //should be false
    System.out.println(a.equals(a)); //should be true

    
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
