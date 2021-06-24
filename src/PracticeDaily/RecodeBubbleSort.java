package PracticeDaily;

public class RecodeBubbleSort {
    //I am going to recode bubble sort from memory/my understanding of the
    /*This took me one try. Bubble Sort is by far the easiest algorithm for me to remember. The concept is very, very
    straightforward to me. Switching the elements around and boom and boom and boom.
     */
    public static void main(String[] args) {


        int[] ay = {12, 34, 235, 25, 24, 6, 46, 35, 7, 57, 46, 8, 68, 576};
        for (int i = ay.length - 1; i > 0; i--){
            for( int j = 0; j < i; j++){
                if (ay[j] > ay[j + 1]){
                    swap(ay, j, j + 1);
                }
            }
        }
        for(int b = 0; b <ay.length; b++){
            System.out.println(ay[b]);
        }
    }
    public static void swap(int[] a, int x, int y){
        if(x == y){
            return;
        }
        int littleMan = a[x];
        a[x] = a[y];
        a[y] = littleMan;

    }
}
