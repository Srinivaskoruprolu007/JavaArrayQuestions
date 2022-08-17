package Arrays.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[]arr= {1,6,2,7,2,7,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int n = arr.length;
        //One by one move boundary of unsorted Sub array
        for (int i = 0; i <n-1 ; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr,i,min_index);
        }
    }

    private static void swap(int[] arr, int i, int min_index) {
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }
}
