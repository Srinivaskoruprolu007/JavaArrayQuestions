package Arrays.Searching;

import java.util.Arrays;

// Binary search only applicable for sorted Array
public class BinarySearch {
    private static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length;
        while (start<end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end=mid-1;
            }
            if(target > arr[mid]){
                start= mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,45};
        System.out.println(search(arr,45));
    }
}
