package PracticeDaily;

public class RecodeMergeSort {
    public static void main(String[] args){
        int[] array =  {1,2,2,4,53,3,524,6,6735,7,357,434,245,134,46,6};

    }
    public static void mergeSort(int[] a , int start, int end){
        if (end - start < 2){
            return;
        }
        int mid = (end - start)/2;
        mergeSort(a,start,mid);
        mergeSort(a,mid,end);
        mergeMerge(a,start,mid,end);
    }
    public static void mergeMerge(int[] array, int start, int mid, int end){
        if(array[mid] > array[mid - 1]){
            return;
        }
        int i = start;
        int j = mid;
        int tIndex = 0;
        int[] tempArray = new int[end - start];
        while(i < mid && j < end){
            tempArray[tIndex++] = array[i] <= array[j] ? array[j++] : array[i++];
        }
        //remaining i elements into the array, then
        System.arraycopy(array, i, array, start + tIndex, mid - 1);
        System.arraycopy(tempArray, 0, array, start, tIndex);
    }
}
