import java.util.*;
public class printrepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Array Values :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = arr[arr.length-1];
        int cpy[] = new int[m+1];
        for (int i = 0; i < arr.length; i++) {
            cpy[arr[i]]++;
        }
        for (int i = 0; i < cpy.length; i++) {
            if (cpy[i] > 1) {
                System.out.println("Frequecy:" + cpy[i]);
            }
        }
    }    
}

