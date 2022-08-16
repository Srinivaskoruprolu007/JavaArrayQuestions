package Arrays.Level01;

import java.util.Arrays;

public class ReverseArray {

    static void reverse(int []arr, int start, int end){
        if(start>= end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
        reverse(arr,start+1,end-1);

    }

    public static void main(String[] args) {
        int[]arr = {1,4,2,7,2};
        int start = 0;
        int end = arr.length-1;
        reverse(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
}
