import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        num = Math.abs(num);
        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
