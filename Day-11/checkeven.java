import java.util.Scanner;
public class checkeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is even: " + isEven(number));
        scanner.close();
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
