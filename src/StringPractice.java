public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String stringVariable = "Last part";

    // Find the length of the string
    int stringSize = stringVariable.length();

    // Concatenate (add) two strings together and reassign the result
    String string1 = "Frst String";
    String string2 = "Second String";

    String concatString = string1 + string2;

    // Find the value of the character at index 3
    System.out.println(concatString.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string
    // have "abc" in it?)
    System.out.println(concatString.indexOf("abc"));

    // Iterate over the characters of the string, printing each one on a separate
    // line
    for (int i = 0; i < concatString.length(); i++) {
      System.out.println(concatString.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    String[] games = new String[4];
    // Add multiple strings to the List (OK to do one-by-one)
    games[0] = "Game 1";
    games[1] = "Game 2";
    games[2] = "Game 3";
    games[3] = "Game 4";
    games[4] = "Game 5";

    // Join all of the strings in the list together into a single string separated
    // by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(",", games);
    System.out.println(joinedString);

    // Check whether two strings are equal
    boolean equalStrings = string1.equals(string2);
    System.out.println(equalStrings);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
