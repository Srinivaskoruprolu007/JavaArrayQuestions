package Arrays.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[]arr = {2,4,1,7,3,6};
        methodSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void methodSort(int[]arr){
        for (int i=1;i<arr.length;i++){
            //create a current element i.e key
            int key = arr[i];
            int j = i-1;//pre element

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
