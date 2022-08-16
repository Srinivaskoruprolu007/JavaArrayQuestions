package Arrays.Level02;
//Finding Common Elements in three Sorted Arrays
//ALGORITHM
//take a for loop for first array and take two inner loops for the other two arrays
//And compare with one another and print it
public class CommonElements {
//    beginner Approach O(n^3)
    private static void Method1(int[]arr1,int[]arr2,int[]arr3){
        for (int value : arr1) {
            for (int i : arr2) {
                for (int j : arr3) {
                    if (value == i && i == j) {
                        System.out.println(value);
                    }
                }
            }
        }
    }
//    Main Method
public static void main(String[] args) {
    int[]arr1={1,5,6,7,8,9,20};
    int[]arr2={6,7,20,24,26};
    int[]arr3={3,4,6,15,20,30,70};
    Method1(arr1,arr2,arr3);
    Method2(arr1,arr2,arr3);
}
private static void Method2(int[]arr1,int[]arr2,int[]arr3){
        int x=0,y=0,z=0;
        while(x<arr1.length && y<arr2.length&& z<arr3.length){
            if(arr1[x]==arr2[y] && arr2[y]==arr3[z]){
                System.out.println(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] > arr2[y]) {
                y++;
            } else if (arr2[y]>arr3[z]) {
                z++;
            }
            else{
                x++;
            }
        }
}
}
