package Arrays;

public class SecondLargest {
    public static int secondLargest(int[] nums) {
        int largest = nums[0];
        int slargest = -1;
        for(int num : nums) {
            if(num > largest) {
                slargest = largest;
                largest = num;
            }else if(num > slargest && num < largest) {
                slargest = num;
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 0, 9, 10};
        System.out.println(secondLargest(nums));
    }
}
