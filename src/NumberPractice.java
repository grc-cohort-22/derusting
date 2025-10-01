public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    double negValue = -1.0;
    // Create an int with a positive value and assign it to a variable
    int posValue = 9;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = posValue % 3;
    System.out.println("Remainder: " + remainder);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if(posValue % 2 == 0) {
      System.out.println("Number is even.");
    } else {
      System.out.println("Number is odd.");
    }
    // Divide the number by another number using integer division
    int result = posValue / 3;
    System.out.println(result);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
