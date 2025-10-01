
import java.util.HashMap;
import java.util.Map;



public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String ,Integer> newMap = new HashMap<>();
    
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    newMap.put("Sasha", 9);
    newMap.put("phone", 14);
    newMap.put("gizmo", 1);
    newMap.put("pink", 21);

    // Get the value associated with a given key in the Map
    Integer val = newMap.get("gizmo");
    System.out.println(val);

    // Find the size (number of key/value pairs) of the Map
    Integer mapSize = newMap.size();
    System.out.println(mapSize);
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    newMap.put("Tammie",21);
    // Check whether the Map contains a given key
    boolean conKey =newMap.containsKey("gizmo");
    System.out.println(conKey);
    // Check whether the Map contains a given value
    boolean conVal = newMap.containsValue(4);
    System.out.println(conVal);
    // Iterate over the keys of the Map, printing each key
    for (String eachKey : newMap.keySet()){
      System.out.println(eachKey);
    }
      
    // Iterate over the values of the map, printing each value
    for(Integer eachVal : newMap.values()){
      System.out.println(eachVal);
    }
    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String , Integer> eachEntry : newMap.entrySet()){
      String keyVal = eachEntry.getKey();
      Integer getKey = eachEntry.getValue();
      System.out.println(keyVal +" "+ getKey);
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
