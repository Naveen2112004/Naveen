import java.util.Scanner;
public class powercalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();        
        System.out.print("Enter exponent (y): ");
        int y = sc.nextInt();        
        long result = power(x, y);
        System.out.println(x + "^" + y + " = " + result);        
        sc.close();
    }
    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
