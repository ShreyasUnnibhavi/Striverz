package Arrays;
import java.util.*;

public class RotateByK {
    public static void rotateBrute(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int[] temp = new int[k];
        for(int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for(int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }
        int j = 0;
        for(int i = n - k; i < n; i++) {
            nums[i] = temp[j++];
        }
    }
    public static void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotateOptimal(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if(k == 0) return;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        // rotateBrute(nums, k);
        rotateOptimal(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
