package PracticeDaily;

public class RecodeSelectionSort {

    //I will be trying to recode selection sort just using the "sort's" logic found in my original notes...
    /* Completed... I got this one right in a similar fashion and I basically just got the i's and the j's
    switched up. But ultimately I understand the logic of this algorithm.
     */
public static void main(String[] args){
    int[] initArray = {13,124,35,3,5,42,6,6,53,635,7,357,3,57,35,7,235,123,521,5};
    for(int i = initArray.length - 1; i > 0; i--){
        int largest = 0;
        for(int j = 1; j <= i; j++){
            if(initArray[j] > initArray[largest]){
                largest = j;
            }
            swap(initArray, largest, i);
        }
    }
    for( int i = 0; i<initArray.length; i++){
        System.out.println(initArray[i]);
    }

}
public static void swap(int[] a, int x, int y){
    if(x == y){
        return;
    }
    int swapper = a[x];
    a[x] = a[y];
    a[y] = swapper;
}
}
