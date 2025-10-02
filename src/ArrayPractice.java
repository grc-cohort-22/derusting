public class ArrayPractice { 
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String [] wordStrings = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    wordStrings[0] = "10";
    wordStrings[1] = "20";    
    wordStrings[2] = "30";
    wordStrings[3] = "40";
    // Get the value of the array at index 2
    System.out.println("The value at index 2 is " + wordStrings[2]);
    // Get the length of the array
    System.out.println("The length of the array is " + wordStrings.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < wordStrings.length; i++) {
      System.out.println("The value at index " + i + " is " + wordStrings[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String word : wordStrings) {
      System.out.println("The value is " + word);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
