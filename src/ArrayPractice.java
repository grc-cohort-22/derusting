  import java.util.Arrays;
public class ArrayPractice {

  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] arr = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    arr[0] = "This";
    arr[1] = "is";
    arr[2] = "an";
    arr[3] = "array";

    // Get the value of the array at index 2
    String valueAtIndex2 = arr[2]; // Receiving the value at index 2

    // Get the length of the array
    int lengthOfArray = arr.length; // Length of array

    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

    // Iterate over the array using a for-each loop and print out each item

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
