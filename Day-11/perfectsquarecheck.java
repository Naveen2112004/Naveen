import java.util.Scanner;
public class perfectsquarecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        double sqrt = Math.sqrt(number);
        if (sqrt == Math.floor(sqrt)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }        
        scanner.close();
    }
}