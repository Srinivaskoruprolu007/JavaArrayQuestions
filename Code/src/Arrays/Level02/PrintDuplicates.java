package Arrays.Level02;

import java.util.HashSet;

public class PrintDuplicates {
    public static void main(String[] args) {
        int[]arr = {1,5,72,32,1,3,5};
        printDoop(arr);
    }
    static void printDoop(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        boolean isDuplicate = false;
        for (int j : arr) {
            if (set.contains(j)) {
                isDuplicate = true;
                System.out.println("The duplicate element  is " + j);
            } else {
                set.add(j);
            }
        }
        if(!isDuplicate){
            System.out.println(-1);
        }
    }
}
