import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String, Integer> a = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    a.put("bib", 1);
    a.put("viv", 2);
    a.put("gig", 3);
    // Get the value associated with a given key in the Map
    System.out.println(a.get("gig"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println(a.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    a.put("bib", 7);
    // Check whether the Map contains a given key
    a.containsKey("viv");
    // Check whether the Map contains a given value
    a.containsValue(7);
    // Iterate over the keys of the Map, printing each key
    for( int i = 0; i < a.size(); i++) {
      System.out.println(a.keySet(i));
    }
    // Iterate over the values of the map, printing each value
    for ( int i = 0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }
    // Iterate over the entries in the map, printing each key and value
    for ( int i = 0; i < a.size(); i++) {
      System.out.println(a.keySet(i));
      System.out.println(a.get(i));
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
