package LeetCodePractice;

public class SearchInsertPosition{
    /*This is for the search insert position problem on leetcode. I have seen this problem before when I was tired
    and at the end of a study session. It was challenging for me to stay organized so I miffed it. But here I solved it
    on the second try. It was faster than 100 percent of solutions for some reason. Maybe I needed to make it recursive?
     */
    public static void main(String[] args){
        int[] a = {1,3,5,6};

        System.out.println(a.length);
        System.out.println(searchInsert(a,5));

    }
    public static int searchInsert(int[] nums, int target){
        for (int i = 0; i< nums.length; i++){
            if (target<nums[0]){
                return 0;
            }
            if (target > nums[nums.length - 1]){
                return nums.length;
            }
            if (target == nums[i] || target < nums[i]){
                return i;
            }

        }
        return target;
    }
}

