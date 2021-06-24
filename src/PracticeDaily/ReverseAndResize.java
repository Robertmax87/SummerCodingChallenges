package PracticeDaily;

import java.util.Arrays;

public class ReverseAndResize {
    //my goal for today will be to reverse an array then add it to the original array using arraycopy
    /*Completed... This took me one retry with the java visualizer. I did not realize that I needed to
    traverse the input array's index instead I just said the tempIndex was equal to j while J was counting up
    and then counting back down. It's good to know that my initial approach was the correct one. Tomorrow I will most
    likely try to reverse a linked list from scratch or from leetCode. This attempt took me around 30 minutes where it
    should've been easier. 
     */
    public static void main(String[] args){
        int[] a = {1,2,3,4,4,3,234,5,45,6,56,7};
        reverseAndAdd(a);


    }
    public static void reverseAndAdd(int[] a){
        int i;
        int tempIndex = 0;
        int tempIndex2 = a.length;
        int[] tempArray = new int[a.length * 2 ];
        for(int j = 0; j < a.length; j++){
            tempArray[tempIndex++] = a[j];
        }
            for(i = a.length - 1; i >= 0; i --){
                tempArray[tempIndex2++] = a[i];


            }
            System.out.println(Arrays.toString(tempArray));

    }

}
