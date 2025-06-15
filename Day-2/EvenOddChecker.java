import java.util.Scanner;

public class EvenOddChecker {

    public static String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = checkEvenOdd(num);
        System.out.println("The number " + num + " is " + result + ".");

        scanner.close();
    }
}
