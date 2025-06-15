import java.util.Scanner;
public class largestnumber {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);                
                int temp = 0;

                for (int i = 0; i < 3; i++) {
                    int z = scanner.nextInt();
                    if (z > temp) {
                        temp = z;
                    }
                }
                System.out.println(temp);
            }
}
