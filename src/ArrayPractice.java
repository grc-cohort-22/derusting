import java.util.ArrayList;
import java.util.List;

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

     List<String> stringArr = new ArrayList<>();

     stringArr.add("Ryan");
     stringArr.add("Shannon");
     stringArr.add("Hannah");
     stringArr.add("Emmy");

     String string2 = stringArr.get(2);
     int string2Size = string2.length();

     for (int i = 0; i < stringArr.size(); i++){
      System.out.println("traditional: " + stringArr.get(i));
     }

     for (String name : stringArr){
      System.out.println("for-each: " + name);
     }

  }
}
