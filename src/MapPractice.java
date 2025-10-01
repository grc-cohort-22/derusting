import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> hashMap = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    hashMap.put("John", 18);
    hashMap.put("Joseph", 40);
    hashMap.put("David", 50);
    // Get the value associated with a given key in the Map
    System.out.println(hashMap.get("John"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println(hashMap.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    hashMap.replace("David", 50, 20);
    System.out.println(hashMap.size());
    // Check whether the Map contains a given key
    System.out.println(hashMap.containsKey("David"));
    // Check whether the Map contains a given value
    System.out.println(hashMap.containsValue(20));
    // Iterate over the keys of the Map, printing each key
    Set<String> keys = hashMap.keySet();
    for(String key : keys) {
      System.out.print(key);
    }
    // Iterate over the values of the map, printing each value
    Collection<Integer> values = hashMap.values();
    for(int value : values) {
      System.out.print(value);
    }
    System.out.println();
    // Iterate over the entries in the map, printing each key and value
    for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();
      System.out.println("Key: " + key + "Value: "+ value); 
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
