package Arrays.Level01;

public class MinMax {
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int []arr, int n){
        Pair minmax = new Pair();
//        if array contains only one element then gives both min and max as the one number
        if(n==1){
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
//        if the array contains more than one element
        if(arr[0]>arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (int i = 2; i <n; i++) {
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,54,23,89,57};
        int n = arr.length;
        Pair minmax = getMinMax(arr,n);
        System.out.println(minmax.max);
        System.out.println(minmax.min);
    }
}

