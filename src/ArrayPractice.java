

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] str = new String[4];  
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    str[0] = "Jessica";
    str[1] = "Tom";
    str[2] = "Sam";
    str[3] = "Linda";

    // Get the value of the array at index 2
    System.out.println(str[2]);

    // Get the length of the array
    System.out.println(str.length);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0 ; i < str.length; i++){
      System.out.println(str[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for(String eachStr : str){
      System.out.println(eachStr);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
