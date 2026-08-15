package Hashmap;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Banana", 40);
        map.put("Cherry", 75);
        System.out.println("Apple count: " + map.get("Apple"));
        System.out.println("Default count: " + map.getOrDefault("Mango", 0));
        
        boolean hasKey = map.containsKey("banana");
        map.putIfAbsent("Apple", 200);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
