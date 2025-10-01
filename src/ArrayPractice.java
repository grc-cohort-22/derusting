/* Name: Anthony Kravchishin */
import java.util.*;

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] list = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    list[0] = "First";
    list[1] = "Second";
    list[2] = "Third";
    list[3] = "end";
    // Get the value of the array at index 2
    System.out.println(list[2]);
    // Get the length of the array
    System.out.println(list.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String item : list) {
        System.out.println(item);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
