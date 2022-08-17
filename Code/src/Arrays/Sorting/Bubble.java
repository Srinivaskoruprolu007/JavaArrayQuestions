package Arrays.Sorting;
import java.util.*;
public class Bubble {
    static void sort(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                if(arr[i] < arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[]arr={0,4,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
