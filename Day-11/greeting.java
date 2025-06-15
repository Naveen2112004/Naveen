import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        printGreeting(name);
        sc.close();
    }
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
