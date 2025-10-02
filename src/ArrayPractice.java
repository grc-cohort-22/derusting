public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[]myArray;
    myArray = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    
    myArray[0] = "Green River";
    myArray[1] = "Seattle Central";
    myArray[2] = "Highline";
    myArray[3] =  "South Seattle";

    // Get the value of the array at index 2
    System.out.println(myArray[2]);

    // Get the length of the array
    System.out.println(myArray.length);

    // Iterate over the array using a traditional for loop and print out each item
 for (int i =0; i<myArray.length; i++){
   System.out.println("Element at index " + i + ": " +myArray[i]);
 }
    // Iterate over the array using a for-each loop and print out each item
   for (String myArray1 : myArray ){
    System.out.println(myArray1);
   }
    
   }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }

