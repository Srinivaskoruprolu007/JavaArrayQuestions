package Arrays.Level01;

public class KthElement {
    private static int kthElement(int[]arr,int l, int r, int k){
        if(k > 0 && k <= r-l+1){
            int pos = randomPartition(arr,l,r);
            if(pos-1 == k-1){
                return arr[pos];
            }
            if(pos-1 > k-1){
                return kthElement(arr,l,pos-1,k);
            }
            return kthElement(arr,pos+1,r,k-pos+l-1);
        }
        return Integer.MAX_VALUE;
    }

    private static int randomPartition(int[] arr, int l, int r) {
        int n = r-l+1;
        int pivot = (int)(Math.random()*(n-1));
        swap(arr,l+pivot,r);
        return partition(arr,l,r);
    }

    private static void swap(int[] arr, int i, int r) {
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }

    private static int partition(int[] arr, int l, int r) {
        int x = arr[r], i = l;
        for (int j = l; j < r; j++) {
            if(arr[j] <= x){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,r);
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {12,3,4,6,32,1};
        System.out.println(kthElement(arr,0, arr.length -1,4));
    }


}
