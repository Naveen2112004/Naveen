import java.util.Arrays; 
import java.util.Scanner;
public class looparray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ECE_F = new int[10];

        for (int i = 0; i < 10; i++) {
            ECE_F[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ECE_F));
        }
    }
