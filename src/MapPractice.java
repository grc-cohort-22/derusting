import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> mapStr = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    mapStr.put("one", 1);
    mapStr.put("two", 2);
    mapStr.put("three", 3);
    System.out.println(mapStr);
    // Get the value associated with a given key in the Map
    System.out.println(mapStr.get("one"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println(mapStr.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    mapStr.replace("one", 5);
    System.out.println(mapStr);
    // Check whether the Map contains a given key
    System.out.println(mapStr.containsKey("one"));
    // Check whether the Map contains a given value
    System.out.println(mapStr.containsValue(5));
    // Iterate over the keys of the Map, printing each key
    System.out.println();
    for (String key : mapStr.keySet()) {
      System.out.println(key);
    }
    // Iterate over the values of the map, printing each value
    for (Integer value : mapStr.values()) {
      System.out.println(value);
    }
    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String, Integer> entry : mapStr.entrySet()){
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    /*
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
