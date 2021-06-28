package LeetCodePractice;

public class MaximumSubArray {
    //I retried this problem on Sunday after almost solving it on Saturday.
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(array));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0 ) {
                int sum = nums[i] + nums[i + 1];
                i++;
                if (sum + nums[i] < 0) {
                    sum = 0;

                }
            }


        }
return 9;
    }
}