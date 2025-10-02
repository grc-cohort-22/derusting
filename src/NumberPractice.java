public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float a = (-5);
    // Create an int with a positive value and assign it to a variable
    int b = 7;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int c = b%3;
    // Use the modulo % operator to determine whether the number is even
    boolean d = false;
    if (c%2 == 0) {
      d = true;
    }
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    if (d == true) {
      System.out.println("even"); //unsure why it inserted an X, and whenever I try to delete it it also deletes the quotes
    }
    else {
      System.out.println("odd");
    }
    // if the number is odd.

    // Divide the number by another number using integer division
    int e = b/c;
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
