import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) System.out.print(", ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}