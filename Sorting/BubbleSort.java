package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swap = true;
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j] < nums[j - 1]) {
                    swap = false;
                    swap(nums, j, j - 1);
                }
            }
            if(!swap) break;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 6, 2, 6, 7, 3, 1, 9, 7, 3, 5, 7, 8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
