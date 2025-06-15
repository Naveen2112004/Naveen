import java.util.Scanner;
public class duplicatearray {       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();        
        int[] array = new int[size];        
        System.out.println("Enter the elements:");
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Duplicate elements in the array:");
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
        scanner.close();
    }
}
