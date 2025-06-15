import java.util.Scanner;
public class minutestohours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total minutes: ");
        int totalMinutes = scanner.nextInt();
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.println(totalMinutes + " minutes = " + hours + " hours " + minutes + " minutes");
        scanner.close();
    }
}
