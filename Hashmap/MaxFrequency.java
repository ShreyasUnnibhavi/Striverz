package Hashmap;

import java.util.HashMap;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] array = {2,2,3,4,4,2, 3, 3, 3, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        int maxFreq = 0, maxEl = 0;
        int minFreq = array.length, minEl = 0;
        for(HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();
            int count = e.getValue();
            if(count > maxFreq) {
                maxEl = key;
                maxFreq = count;
            }
            if(count < minFreq) {
                minEl = key;
                minFreq = count;
            }
        }
        System.out.println("Maximum: " + maxEl);
        System.out.println("Minimum: " + minEl);
    }
}
