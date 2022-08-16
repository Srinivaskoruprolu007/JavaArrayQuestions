package Arrays.Level01;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr){
        int n = arr.length;
        // First check last or first element
        if(n==1){
            return 0;
        }
        if(arr[0] >= arr[1]){
            return 0;
        }
        if(arr[n-1] >=arr[n-2]){
            return n-1;
        }
        // check for every other element
        for(int i = 1; i < n-1 ; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return i;
            }
        }
        return 0;
    }
}
