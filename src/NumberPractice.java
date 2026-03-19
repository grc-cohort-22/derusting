

public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    Float f = -1f;
    System.out.println("float: " + f);
    // Create an int with a positive value and assign it to a variable
    Integer i = 1;
    System.out.println("int: " + i);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = i%3;
    System.out.println("remainder: " + remainder);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    System.out.println("is int even: ");
    System.out.print( i%2 == 0);
    // Divide the number by another number using integer division
    System.out.println("integer division: ");
    System.out.print(i/2);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
