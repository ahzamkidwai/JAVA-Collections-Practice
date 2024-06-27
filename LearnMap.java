// import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);

        // This will override the above key with 'two'.
        // numbers.put("two", 22);

        // System.out.println(numbers.containsKey("two"));

        // To check whether the key is present or not.
        if (!numbers.containsKey("two")) {
            numbers.put("two", 22);
        }

        // To check whether the value is present or not.
        if (numbers.containsValue(2)) {
            System.out.println(numbers.containsValue(2));
        }

        // Similar to above if-condition
        numbers.putIfAbsent("two", 2);
        System.out.println("Numbers is : " + numbers);

        // Iterating over the hash map
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);

            System.out.println("Key is : " + e.getKey() + " and its value is : " + e.getValue());
        }

        // To iterate over teh key-set

        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        // To iterate over the values of hash-map

        for (Integer value : numbers.values()) {
            System.out.println(value);
        }
    }
}
