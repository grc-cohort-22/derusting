/*
 * In this file you will follow the comments' instructions to complete
 * the Person class.
 */

public class Person {
  // Declare a public String instance variable for the name of the person
  // Declare a private int instance variable for the age of the person


  // Create a constructor that takes the name and age of the person
  // and assigns it to the instance variables


  // Create a toString method that gives the name and age of the person


  // Implement the below public instance method "birthYear"
  // There should NOT be any print statement in this method.


  public String name;
  private int age;
  
  public Person(String full_name, int num_age){
    this.name = full_name;
    this.age = num_age;
  }

  @Override
  public String toString(){
    return "name: " + this.name + "\nage: " + this.age;
  }

  public int birthYear(int year){
    return year - this.age;
  }
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


  public static void main(String[] args) {
    // Create an instance of Person

    // Create another instance of Person with a different name and age and
    // assign it to a different variable

    // Print the first person

    // Print the second person

    // Get the name of the first person and store it in a local variable

    // Using the birthYear method, get the birth year of the first person
    // and store it in a local variable. Input the actual current year (e.g. 2025)
    // as the argument.

    // In a separate statement, print the local variable holding the birth year.
    int currentYear = 2025;

    int age = 29;
    String name = "Ryan Mills";

    Person newPerson = new Person(name, age);

    System.out.println("person1: \n" + newPerson.toString());

    int age2 = 22;
    String name2 = "Hannah Banana";

    Person newPerson2 = new Person(name2, age2);

    System.out.println("person2: \n" + newPerson2.toString());

    String person1Name = newPerson.name;

    int birthYear1 = newPerson.birthYear(currentYear);

    System.out.println("\npersonName: " + person1Name + "\nbirth: " + birthYear1);


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
