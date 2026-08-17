package Arrays;

public class RemoveDuplicates {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int remove(int[] nums) {
        int i = 0;
        int j = 1;
        while(j < nums.length) {
            if(nums[i] != nums[j]) {
                i++;
                swap(nums, i, j);
            }
            j++;
        }
        return ++i;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 6, 6};
        System.out.println(remove(nums));
    }
}
