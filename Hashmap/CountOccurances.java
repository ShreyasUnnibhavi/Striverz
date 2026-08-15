package Hashmap;

import java.util.HashMap;

public class CountOccurances {
    public static void main(String[] args) {
        int[] nums = {10, 5, 10, 15, 10, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
