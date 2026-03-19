
public class ArrayPractice {
  public static void main(String[] args) {

    // Create an array of Strings of size 4
    String[] b = new String [4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    for(int i =0; i < 4; i++){
      b[i] = "a"+ Integer.toString(i);
      System.out.println("array: " + b[i]);
    }
    
    // Get the value of the array at index 2
    String i2= b[1];
    System.out.println("array index 2: " + i2);

    // Get the length of the array
    int len = b.length;
    System.out.println("array length: " + len);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i =0; i < 4; i++){
      b[i] = "a"+ Integer.toString(i);

      System.out.println("traditional loop print: " + b[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for (String s : b) {
            System.out.println("foreach print: " + s);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
