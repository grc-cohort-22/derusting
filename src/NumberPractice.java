public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float myFloat = -6.1f;
    System.out.println(myFloat);
    // Create an int with a positive value and assign it to a variable
    int myInt = 250;
    System.out.println(myInt);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int a = 8;
    int b = 3;
    int x = a%b;
    System.out.println(x);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (a % 2 == 0){
      System.out.println(a + " Even");
    }else{
      System.out.println(a + " Odd");
    }
    

    // Divide the number by another number using integer division
    int c = 18;
    int d = 5;
    int y =c/d ;
    System.out.println(y);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
