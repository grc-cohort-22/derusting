/*
 * In this file you will follow the comments' instructions to complete
 * the Person class.
 */

public class Person {
  // Declare a public String instance variable for the name of the person
  public String name; // instance variable (can be accessed outside class )

  // Declare a private int instance variable for the age of the person
  private int age;// can only be accessed within the class (private)

  // Create a constructor that takes the name and age of the person
  public Person(String name, int age) {
  // and assigns it to the instance variables
    this.name = name;
    this.age = age;
  }
  
  // Create a toString method that gives the name and age of the person
  public String toString() {
    return "name: " + name + " age: " + age; 
  }

  // Implement the below public instance method "birthYear"
  // There should NOT be any print statement in this method.
  /**
   * birthYear returns the year the person was born.
   * 
   * The birth year is calculated by subtracting the person's age from currentYear
   * that's passed in as an int. It assumes that the person's birthday has already
   * passed this year.
   * 
   * @param currentYear an int for the current year
   * @return The year the person was born
   */
  // (create the instance method here)
  public int birthYear(int currentYear) {
    int yearOfBirth = currentYear - age;
    return yearOfBirth;
  }

  // Getter Method
  public String getName() {
    return this.name;
  }


  public static void main(String[] args) {
    // Create an instance of Person
    Person p = new Person("Xavier", 35);

    // Create another instance of Person with a different name and age and
    // assign it to a different variable
    Person pTwo = new Person("Jhoanna", 36);

    // Print the first person
    System.out.println(p);

    // Print the second person
    System.out.println(pTwo);

    // Get the name of the first person and store it in a local variable
    System.out.println(p.getName());
    
    // Using the birthYear method, get the birth year of the first person
    // and store it in a local variable. Input the actual current year (e.g. 2025)
    // as the argument.
    int bornYear = p.birthYear(2025); 

    // In a separate statement, print the local variable holding the birth year.
    System.out.println("The year of birth for " + p.getName() + " is: " + bornYear);

    /**
     * Terminology!
     * 
     * A class is the overall definition, like a blueprint.
     * An instance is a specific object made according to that definition.
     * We use "instance" and "object" to mean the same thing.
     * 
     * For example, if there is a Person class, we can make an instance of a specific person: Auberon.
     * 
     * There can be many instances for the same class. For example: Auberon, Xinting, Baya are all
     * different instances of the Person class.
     * 
     * Each instance has its own instance variables: Auberon's age can be different from Baya's age.
     */
  }
}
