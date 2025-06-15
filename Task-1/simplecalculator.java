import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    scanner.close();
                    return;
                }
                result = (double) a / b;
                break;
            default:
                System.out.println("Invalid operator");
                scanner.close();
                return;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
