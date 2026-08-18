package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class UnionSortedArrays {
    public static int[] unionBrute(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums1) {
            set.add(num);
        }
        for(int num : nums2) {
            set.add(num);
        }
        int[] union = new int[set.size()];
        int i = 0;
        for(int num : set) {
            union[i++] = num;
        }
        return union;
    }
    public static ArrayList<Integer> unionOptimal(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
            }else if(nums2[j] < nums1[i]) {
                if(list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                j++;
            }else {
                if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        while(i < n1) {
            if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                list.add(nums1[i]);
            }
            i++;
        }
        while(j < n2) {
            if(list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                list.add(nums2[j]);
            }
            j++;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 4, 5};
        int[] nums2 = {6, 6, 7, 7, 8, 9, 10};
        // int[] sorted = unionBrute(nums1, nums2);
        int[] sorted = unionBrute(nums1, nums2);
        ArrayList<Integer> list = unionOptimal(nums1, nums2);
        System.out.println(list);
    }
}
