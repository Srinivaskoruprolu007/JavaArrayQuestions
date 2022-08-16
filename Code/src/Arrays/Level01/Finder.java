package Arrays.Level01;

public class Finder {
    public static void main(String[] args) {
        float[] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float number:marks) {
            if(num == number){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The searching element is available " );
        }
        else{
            System.out.println("The searching element i snot available ");
        }
    }
}
