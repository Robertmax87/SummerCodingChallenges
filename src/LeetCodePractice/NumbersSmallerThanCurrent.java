package LeetCodePractice;

public class NumbersSmallerThanCurrent {
    /*This took me like 15 minutes since I didn't know the answer I was trying to get initially
    I needed to return a different array;
     */
    public static void main(String[] args){
    int[] array = {8,1,2,2,3};
    smallerNumbersThanCurrent(array);
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] temper = new int[nums.length];
        int index = 0;
        for (int j = 0; j< nums.length; j++){
            int counter = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] < nums[j]){
                    counter++;

                }


            }

            temper[index] = counter;
            index++;
        }

        return temper;

    }
}

