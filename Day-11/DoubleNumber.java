import java.util.*;
public class DoubleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int doubled = number * 2;
        System.out.println("Double of the number is: " + doubled);
        scanner.close();
    }
}
