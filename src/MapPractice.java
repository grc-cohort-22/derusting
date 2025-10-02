import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> map = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    map.put("Apples", 5);
    map.put("Bananas", 10);
    map.put("Cherries", 15);
    // Get the value associated with a given key in the Map
    System.out.println("Value for 'Bananas': " + map.get("Bananas"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println("Map size: " + map.size());
    // Replace the value associated with a given key (the size of the Map shoukld
    // not change)
    map.put("Bananas", 12);
    System.out.println("Updated value for 'Bananas': " + map.get("Bananas"));
    // Check whether the Map contains a given key
    System.out.println("Contains key 'Apples'? " + map.containsKey("Apples"));
    // Check whether the Map contains a given value
    System.out.println("Contains value 15? " + map.containsValue(15));
    // Iterate over the keys of the Map, printing each key
    System.out.println("Keys in map:");
    for (String key : map.keySet()) {
      System.out.println(key);
    }
    // Iterate over the values of the map, printing each value
    System.out.println("Values in map:");
    for (Integer value : map.values()) {
      System.out.println(value);
    }
    // Iterate over the entries in the map, printing each key and value
    System.out.println("Entries in map:");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone
     * number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the
     * keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
