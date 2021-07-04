package LeetCodePractice;

public class RevisedRemoveElement {
    //This one also works, It even works with the second test case. 
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        removeElements(nums,3);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
    }
    public static int removeElements(int[] nums, int val){
        int size = 0;
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] == val){
                size++;
                i--;
            }
            for (int j = 0; j<i; j++){
                if(nums[j] == val){
                    swap(nums, j, i);
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
