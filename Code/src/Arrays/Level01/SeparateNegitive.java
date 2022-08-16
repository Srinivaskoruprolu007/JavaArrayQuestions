package Arrays.Level01;

public class SeparateNegitive {
    public static void main(String[] args) {
        int[]arr = {-2,5,2,52,6,-45,0,-45};
        sep(arr);
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
    private static void sep(int[] arr){
        int j =0, temp;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<0){
                if(i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
