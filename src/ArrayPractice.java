public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] x = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    x[0] = "abc";
    x[1] = "def";
    x[2] = "ghi";
    x[3] = "jkl";
    // Get the value of the array at index 2
    System.out.println(x[2]);
    // Get the length of the array
    System.out.println(x.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i<x.length; i++) {
      System.out.print("[" + x[i] + "]");
    }
    // Iterate over the array using a for-each loop and print out each item
    System.out.println("");

    for (String letters : x) {
      System.out.println(letters);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
