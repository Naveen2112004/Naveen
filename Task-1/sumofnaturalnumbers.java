import java.util.Scanner;
            public class sumofnaturalnumbers {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    int sum = n * (n + 1) / 2;
                    System.out.println("The sum of all natural numbers up to " + n + " is: " + sum);
                    scanner.close();
                }
            }