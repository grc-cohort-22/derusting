
public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
      String[] list = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
      list[0] = "hola";
      list[1] = "mi";
      list[2] = "nombre";
      list[3] = "Kevin";

    // Get the value of the array at index 2
      System.out.println(list[2]);
    // Get the length of the array
      System.out.println(list.length);
    // Iterate over the array using a traditional for loop and print out each item
      for (int i = 0; i<list.length; i++){
        System.out.println(list[i]);
      }
      System.out.println();
    // Iterate over the array using a for-each loop and print out each item
      for (String str: list){
        System.out.println(str);
      }
      System.out.println();
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
