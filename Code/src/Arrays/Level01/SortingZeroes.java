package Arrays.Level01;

import java.util.Arrays;

public class SortingZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,2,0,1};
        int arr_size = arr.length;
        sort(arr,arr_size);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int [] arr, int arr_size)
    {
        int low = 0;
        int high = arr_size-1;
        int mid = 0, temp = 0;
        while(mid<=high)
        {
            switch (arr[mid])
            {
            case 0 : {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
                break;
            }
            case 1:
            {
                mid++;
                break;
            }
            case 2 : {
                 temp = arr[high];
                 arr[high] = arr[mid];
                 arr[mid] = temp;
                 high--;
                 break;
            }
        }
    }
}
}
