import java.util.Arrays;
public class minimumandmaximum {
    public static void main(String[] args) {
        int[] arr = {5, 32, 19, 11, 7, 26, 93};        
        int min = arr[0];
        int max = arr[0];        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }        
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }
}

