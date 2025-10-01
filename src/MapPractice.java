import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and

    HashMap<String, Integer> studentRecord = new HashMap<>();
    // assign it to a variable of type Map
    Map<String, Integer> studentRecordMap = studentRecord;
    // Put 3 different key/value pairs in the Map

    studentRecordMap.put("Saron", 112233);
    studentRecordMap.put("Goitom", 123456);
    studentRecordMap.put("Babi", 2345);

    // (it's OK to do this one-by-one)

    // Get the value associated with a given key in the Map
    studentRecordMap.get("Saron");
    // Find the size (number of key/value pairs) of the Map
    studentRecordMap.size();
    // Replace the value associated with a given key (the size of the Map shoukld
    studentRecordMap.replace("Babi", 24567);
    // not change)

    // Check whether the Map contains a given key
    String key_search = "Azeb";
    int value_search_search = 909;
    boolean containsKey = studentRecordMap.containsKey(key_search);
    System.out.println(containsKey);
    // Check whether the Map contains a given value
    boolean containesValue = studentRecordMap.containsValue(value_search_search);
    System.out.println(containesValue);
    // Iterate over the keys of the Map, printing each key
    for (String i : studentRecordMap.keySet()) {
      System.out.println(i);
    }

    // Iterate over the values of the map, printing each value
    for (Integer i : studentRecordMap.values()) {
      System.out.println(i);
    }

    // Iterate over the entries in the map, printing each key and value
    for (String i : studentRecordMap.keySet()) {
      System.out.println(i + ": " + studentRecordMap.get(i));
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
