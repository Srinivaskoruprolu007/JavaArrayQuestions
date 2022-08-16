package Arrays.Level02;

import java.util.Arrays;

public class SumPair {
    public static void main(String[] args) {
        int sum = 9;
        int[] arr = {3,6,-1,10,8,1,11,-2};
        printPair(arr,sum);
    }
    static void printPair(int[]arr, int sum){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        while (low< high){
            if(arr[low]+arr[high] > sum){
                high--;
            }
            if(arr[low]+arr[high] < sum){
                low++;
            }
            if(arr[low]+arr[high] == sum){
                System.out.println("pair ("+arr[low]+","+arr[high]+")");
                high--;
                low++;
            }
        }
    }
}
