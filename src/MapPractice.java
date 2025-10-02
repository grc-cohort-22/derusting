import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> people = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)

     people.put("Manar", 10);
     people.put("Afnan", 6);
     people.put("Semah", 4);

    // Get the value associated with a given key in the Map
    for(String i:people.keySet() ){
      System.out.println("key: " + i + " value: " + people.get(i));
    }

    // Find the size (number of key/value pairs) of the Map
    System.out.println(people.size());

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    String  keyToReplace ="Afnan";
    Integer newValue = 5;
    people.replace(keyToReplace,newValue);
    System.out.println(people);
    // Check whether the Map contains a given key
    System.out.println("Is the given key Semah present?" + people.containsKey("Semah"));
    // Check whether the Map contains a given value
    System.out.println("Is the given value 3 present?" + people.containsValue(3));

    // Iterate over the keys of the Map, printing each key
    for(String name: people.keySet()){
      System.out.println("key:" + name);
    }
    // Iterate over the values of the map, printing each value
    for(Integer age: people.values()){
      System.out.println("valu:" + age);
    }
    // Iterate over the entries in the map, printing each key and value
    for(String i: people.keySet()){
      Integer age = people.get(i);
    System.out.println("key: " + i + " valu: " + age);
    }/*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
