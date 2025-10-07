
public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] arrayOf4SizeStrings = {"Home", "Part", "Love", "Mans"};
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    arrayOf4SizeStrings[0] = "Love";
    arrayOf4SizeStrings[1] = "Joys";
    arrayOf4SizeStrings[2] = "Freedom";
    arrayOf4SizeStrings[3] = "Labor";
    // Get the value of the array at index 2
    System.out.println(arrayOf4SizeStrings[2]);
    // Get the length of the array
    System.out.println(arrayOf4SizeStrings.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < arrayOf4SizeStrings.length; i++){
      System.out.println(i);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String n : arrayOf4SizeStrings){
      System.out.println(n);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
