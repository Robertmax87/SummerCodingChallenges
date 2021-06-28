package LeetCodePractice;

public class RemoveElement {
    public static void main(String[] args) {
        /*
        Input: nums = [0,1,2,2,3,0,4,2], val = 2
        Output: 5, nums = [0,1,4,0,3,_,_,_]
        Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
        Note that the five elements can be returned in any order.
        It does not matter what you leave beyond the returned k (hence they are underscores).
        UPDATE: Completed and got right answer using bubble-sort, however I was not able to do it exactly as LeetCode
        wanted. So what I will do now is retry but sort differently in the way that LeetCode wanted.
         */
        int[] array = {2,3,454,6,2,65,2,4667,2};
        removeElement(array, 2);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int size = 0;
        int shrubbery = nums.length - 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == val) {
                size++;
            }
            for (int j = 0; j<i; j++){
                if(nums[j] == val){
                    swap(nums, j, j + 1);
                }

            }

        }
        return size;
    }

public static void swap(int[] input, int x, int y){
        if (x == y){
            return;
        }
        int holder = input[x];
        input[x] = input[y];
        input[y] = holder;
}
}