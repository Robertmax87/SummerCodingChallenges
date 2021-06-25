package LeetCodePractice;

import java.util.Arrays;

public class TwoSum {
    /*Given an array of integers "nums" and an integer "target", return indices of the two numbers such that they add
    up to "target"

    ex: nums = [2,7,11,15], target = 9
    output: [0,1]

     Completed and done fairly well. I realize that I make a lot of simple mistakes that leave me getting these problems
     wrong (for some, not all). I need to be better at being diligent with my code. I also need to be able to solve the-
     se problems recursively which is what I will attempt right now.
     UPDATE: Never mind, maybe later. It seems that a hashmap might provide a faster solution.
     */
    public static void main(String[] args) {
        int[] a = {3, 2, 4};
        twoSum(a, 6);


    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int b = 0; b < nums.length; b++) {

                if (target - nums[b] == nums[i]) {
                    int[] heyThere = {b, i};
                    System.out.println(Arrays.toString(heyThere));
                    return heyThere;

                }
            }
        }
        return nums;
    }
}
