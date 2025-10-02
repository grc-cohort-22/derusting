public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
      String[] a = {"Mario", "Luigi", "Wario", "Waluigi"};
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    a[0] = "Link";
    a[1] = "Zelda";
    a[2] = "Ganon";
    a[3] = "Demise";
    // Get the value of the array at index 2
    System.out.println(a[2]);
    // Get the length of the array
    System.out.println(a.length);
    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String b : a) {
      System.out.println(b);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
