package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low, j = high;
        while(i < j) {
            while(nums[i] <= pivot && i < high) i++;
            while(nums[j] > pivot && j > low) j--;
            if(i < j) swap(nums, i, j);
        }
        swap(nums, low, j);
        return j;
    }
    public static void sort(int[] nums, int low, int high) {
        if(low < high) {
            int pIdx = partition(nums, low, high);
            sort(nums, low, pIdx - 1);
            sort(nums, pIdx + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 6, 2, 6, 7, 3, 1, 9, 7, 3, 5, 7, 8};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
