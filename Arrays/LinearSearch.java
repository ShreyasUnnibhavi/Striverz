package Arrays;

public class LinearSearch {
    public static int search(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == k) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(nums, 7));
    }
}
