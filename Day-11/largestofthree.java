import java.util.Scanner;
public class largestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + largest);
        sc.close();
    }
}
