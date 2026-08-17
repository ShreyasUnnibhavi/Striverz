package Arrays;

public class LargestElement {
    public static int largest(int[] nums) {
        int max = nums[0];
        for(int n : nums) {
            max = Math.max(n, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 0};
        System.out.println(largest(nums));
    }
}
