package Arrays.Level02;

public class DeleteElement {
    public static void main(String[] args) {
        int[]arr = {1,3,4,6,3,4};
        delete(arr,4);
    }
    static void delete(int[]arr,int pos){
        int n = arr.length;
        if(pos < 0 || pos> arr.length){
            throw new RuntimeException("Invalid Position ");
        }
        else {
            for (int i = pos-1; i <n ; i++) {
                arr[pos-1] = arr[pos];
            }
            n--;
            for (int i = 0; i <n ; i++) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
