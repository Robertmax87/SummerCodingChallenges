package LeetCodePractice;

public class MajorityElement {
    //find the majority element in the array
    //This got me the right solution but I went over the time limit
    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7};
        System.out.print(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            int counter = 1;
            for (int j = 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    counter++;
                    if (counter > nums.length / 2) {
                        return nums[i];
                    }

                }

            }

        }return 9;
    }
}
