import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map

    HashMap<String, Integer> Map = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
      Map.put("a", 1);
      Map.put("b", 2);
      Map.put("c", 3);
    
    // Get the value associated with a given key in the Map
      int x = Map.get("a");
      System.out.println("retrieved value: " + x);

    // Find the size (number of key/value pairs) of the Map
      int x2 = Map.size();
      System.out.println("size: " + x2);


    // Replace the value associated with a given key (the size of the Map shoukld not change)
      for(Map.Entry<String, Integer> entry : Map.entrySet()) {
        entry.setValue(entry.getValue() + 1);
      }

    // Check whether the Map contains a given key
      boolean containsKey = Map.containsKey("a");
      System.out.println("contains key is:  " + containsKey);

    // Check whether the Map contains a given value
      boolean containsVal = Map.containsValue(1);
      System.out.println("contains value is:  " + containsVal);

    // Iterate over the keys of the Map, printing each key
      for (String s : Map.keySet()) {
        System.out.print("  |  "+ s);
      }
      System.out.println();

    // Iterate over the values of the map, printing each value
      for (int i : Map.values()) {
        System.out.print("  |  "+ i);
      }
      System.out.println();
    // Iterate over the entries in the map, printing each key and value
      for(Map.Entry<String, Integer> entry : Map.entrySet()) {
        System.out.print(" | Entry: " + entry);
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
