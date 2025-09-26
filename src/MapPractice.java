import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String,Integer> myHashMap = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    myHashMap.put("Six", 3);
    myHashMap.put("Three", 5);
    myHashMap.put("Four", 4);

    // Get the value associated with a given key in the Map
    myHashMap.get("Six");
    // Find the size (number of key/value pairs) of the Map
    System.out.println("Size of hashmap: " + myHashMap.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)

       myHashMap.put("Six", 6);
    // Check whether the Map contains a given key
      System.out.println("Does myHashmap containsKey Four? " + myHashMap.containsKey("Four"));

    // Check whether the Map contains a given value
        System.out.println("Does myHashmap containsValue 9 " + myHashMap.containsValue(9));


    // Iterate over the keys of the Map, printing each key
    for(String s: myHashMap.keySet()){
      System.out.println("Key: " + s);
    }
    // Iterate over the values of the map, printing each value
    for(int i: myHashMap.values()){
      System.out.println("Value: " + i);
    }

    // Iterate over the entries in the map, printing each key and value
    for(String s: myHashMap.keySet()){
      System.out.println("Key: " + s + ", Value: " + myHashMap.get(s));
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
