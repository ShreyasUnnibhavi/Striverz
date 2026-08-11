package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums, int index) {
        if(index > nums.length / 2) {
            return;
        }
        swap(nums, index, nums.length - 1 - index);
        reverse(nums, index + 1);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0);
        System.out.println(Arrays.toString(nums));
    }
}
