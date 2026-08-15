package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] nums, int si, int mid, int ei) {
        int[] array = new int[ei - si + 1];
        int i = si; //iterator for left half
        int j = mid + 1; //iterator for right half
        int k = 0; //iterator for temporary array
        while(i <= mid && j <= ei) {
            if(nums[i] < nums[j]) {
                array[k++] = nums[i++];
            }else {
                array[k++] = nums[j++];
            }
        }
        while(i <= mid) {
            array[k++] = nums[i++];
        }
        while(j <= ei) {
            array[k++] = nums[j++];
        }
        for(k = 0, i = si; k < array.length; i++ , k++) {
            nums[i] = array[k];
        }
    }
    public static void sort(int[] nums, int left, int right) {
        //base case
        if(left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        sort(nums, left, mid);
        sort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 6, 2, 6, 7, 3, 1, 9, 7, 3, 5, 7, 8};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
