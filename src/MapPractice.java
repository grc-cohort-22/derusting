import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String, Integer> strIntHashMap = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    strIntHashMap.put("test1", 1);
    strIntHashMap.put("test2", 2);
    strIntHashMap.put("test3", 3);

    // Get the value associated with a given key in the Map
    System.out.println(strIntHashMap.get("test2"));

    // Find the size (number of key/value pairs) of the Map
    System.out.println(strIntHashMap.size());

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    strIntHashMap.replace("test2", 4);
    System.out.println(strIntHashMap.size());

    // Check whether the Map contains a given key
    System.out.println(strIntHashMap.containsKey("test1"));

    // Check whether the Map contains a given value
    System.out.println(strIntHashMap.containsValue(2));

    // Iterate over the keys of the Map, printing each key
    for(String key : strIntHashMap.keySet()) {
      System.out.println(key);
    }

    // Iterate over the values of the map, printing each value
    for(Integer value : strIntHashMap.values()) {
      System.out.println(value);
    }

    // Iterate over the entries in the map, printing each key and value
    for(HashMap.Entry<String, Integer> entry : strIntHashMap.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
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
