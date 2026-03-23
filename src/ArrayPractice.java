public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String [] fruits = new String [4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    fruits[0] = "passionfruit";
    fruits[1] = "mango";
    fruits[2] = "pineapple";
    fruits[3] = "kiwi";

    // Get the value of the array at index 2
    System.out.println(fruits[2]);

    // Get the length of the array
    System.out.println(fruits.length);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i =0; i < fruits.length; i++){
      System.out.println(fruits[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for(String fruit : fruits){
      System.out.println(fruit);
    }
  

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
