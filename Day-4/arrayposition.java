import java.util.Scanner;
public class arrayposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {42, 82, 55, 77, 15, 96};9
        System.out.print("Enter the number to find: ");
        int num = scanner.nextInt(); 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Number " + num + " found at position: " + i);
                scanner.close();
            }
        }
    }    
}