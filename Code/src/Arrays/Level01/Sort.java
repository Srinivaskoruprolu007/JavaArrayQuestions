package Arrays.Level01;
//Bubble sort
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr){
        boolean swapped;
        if(arr==null) return;
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
                if(!swapped){
                    break;
                }
            }
        }
    }
private static void insertionSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j> 0;j--){
                if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                }else break;
            }
        }
}
    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
