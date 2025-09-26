public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] shoppingList = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one

    shoppingList[0] = "Bread";
    shoppingList[1] = "Milk";
    shoppingList[2] = "Cheese";
    shoppingList[3] = "Banana";

    // Get the value of the array at index 2
    System.out.println(shoppingList[2]);

    // Get the length of the array

    System.out.println("Length of array: " + shoppingList.length);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < shoppingList.length; i++){
      System.out.println("shoppingList[" + i + "] = " + shoppingList[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for(String str: shoppingList){
      System.out.println(str);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
