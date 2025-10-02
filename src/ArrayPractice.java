import java.util.Random;
public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one

    // Get the value of the array at index 2

    // Get the length of the array

    // Iterate over the array using a traditional for loop and print out each item

    // Iterate over the array using a for-each loop and print out each item

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
    int[] arr = new int[4];
    Random rand = new Random();
    for(int i = 0; i < 4; i++){
        arr[i] = rand.nextInt(9)+1;
    }
    System.out.println(arr[2]);
    System.out.println(arr.length);
  }
}
