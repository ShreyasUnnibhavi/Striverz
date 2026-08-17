package Arrays;

public class IsSorted {
    public static boolean sorted(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};
        System.out.println(sorted(nums));
    }
}
