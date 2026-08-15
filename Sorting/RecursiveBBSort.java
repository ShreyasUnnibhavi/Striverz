package Sorting;

import java.util.Arrays;

public class RecursiveBBSort {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void sort(int[] nums, int n) {
        //Base case
        if(n == 0) return;

        boolean swap = false;
        for (int i = 0; i <= n - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                swap(nums, i, i + 1);
                swap = true;
            }
        }
        if(!swap) return;
        sort(nums, n - 1);
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 6, 2, 6, 7, 3, 1, 9, 7, 3, 5, 7, 8};
        sort(nums,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
