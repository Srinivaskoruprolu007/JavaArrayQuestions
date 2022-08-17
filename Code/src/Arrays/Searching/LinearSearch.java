package Arrays.Searching;

public class LinearSearch {
    //Linear Search method
    static int search(int[] arr,int element){
        if(arr==null){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,45,23,67,43};
        LinearSearch obj = new LinearSearch();
        int i = search(arr,12);
        if(i==-1)
            System.out.println("The element is doesn't exists in Given Array");
        else
            System.out.println(i);
    }
}
