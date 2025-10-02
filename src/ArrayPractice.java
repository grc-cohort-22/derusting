public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] arr = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    arr[0] = "Hello";
    arr[1] = "World";
    arr[2] = "Java";
    arr[3] = "Arrays";

    // Get the value of the array at index 2
    System.out.println("Index 2: " + arr[2]);

    // Get the length of the array
    System.out.println("Length: " + arr.length);
    // Iterate over the array using a traditional for loop and print out each item
    System.out.println("Traditional for loop:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    System.out.println("For-each loop:");
    for (String s : arr) {
      System.out.println(s);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
