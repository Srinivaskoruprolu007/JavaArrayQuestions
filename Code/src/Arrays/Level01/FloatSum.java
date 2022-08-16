package Arrays.Level01;

public class FloatSum {
    public static void main(String[] args) {
//        create an array which can store 5 float values
        float[] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for (float num: marks) {
            sum +=num;
        }
        System.out.println(sum);
    }
}
