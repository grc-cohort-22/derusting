import java.util.Map;
import java.security.KeyStore.Entry;
import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)

    // Get the value associated with a given key in the Map

    // Find the size (number of key/value pairs) of the Map

    // Replace the value associated with a given key (the size of the Map shoukld not change)

    // Check whether the Map contains a given key

    // Check whether the Map contains a given value

    // Iterate over the keys of the Map, printing each key

    // Iterate over the values of the map, printing each value

    // Iterate over the entries in the map, printing each key and value

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

    Map<String, Integer> stringIntMap = new HashMap<>();
    stringIntMap.put("Ryan", 1);
    stringIntMap.put("Hannah", 2);
    stringIntMap.put("Emmy", 3);

    System.out.println(stringIntMap.get("Ryan"));

    System.out.println(stringIntMap.size());

    stringIntMap.put("Ryan", 100);

    System.out.println(stringIntMap.containsKey("Ryan"));

    System.out.println(stringIntMap.containsValue(3));

    for (String name : stringIntMap.keySet()){
      System.out.println(name);
    }

    for (int values : stringIntMap.values()){
      System.out.println(values);
    }

    for (Map.Entry<String, Integer> keySet : stringIntMap.entrySet()){
      System.out.println(keySet);
    }


  }
}
