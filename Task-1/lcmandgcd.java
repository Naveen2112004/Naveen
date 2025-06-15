import java.util.Scanner;
public class lcmandgcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) gcd = i;
        }
        int lcm = (a * b) / gcd;
        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);
    }
}