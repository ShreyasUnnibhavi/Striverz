package Sorting;

import java.util.Arrays;

public class RecursiveInSort {
    public static void sort(int[] nums, int i) {
        //Base case
        if(i == nums.length) return;

        int key = nums[i];
        int j = i - 1;
        while(j >= 0 && nums[j] > key) {
            nums[j + 1] = nums[j];
            j--;
        }
        nums[j + 1] = key;
        sort(nums, i + 1);
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 6, 2, 6, 7, 3, 1, 9, 7, 3, 5, 7, 8};
        sort(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
}
