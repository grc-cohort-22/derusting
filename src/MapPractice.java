import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> userScores = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    userScores.put("Alice", 2);
    userScores.put("Bob", 1);
    userScores.put("Charlie", 3);
    // Get the value associated with a given key in the Map
    userScores.get("Bob");
    // Find the size (number of key/value pairs) of the Map
    System.out.println(userScores.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    userScores.replace("Bob", 7);
    // Check whether the Map contains a given key
    if (userScores.containsKey("Bob")){
      System.out.println("Contains key");
    }
    else {
      System.out.println("Does not contain key");
    }
    // Check whether the Map contains a given value
    if (userScores.containsValue("7")) {
      System.out.println("Does contain 7");
    }
    else {
      System.out.println("Does not contain 7");
    }
    // Iterate over the keys of the Map, printing each key
    for (String key : userScores.keySet()) {
      System.out.println(key);
    }
    // Iterate over the values of the map, printing each value
    for (Integer value : userScores.values()) {
      System.out.println(value);
    }
    // Iterate over the entries in the map, printing each key and value
    for (String k : userScores.keySet()){
      int defOfPair = userScores.get(k);
      System.out.println(k + " " + defOfPair);
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
