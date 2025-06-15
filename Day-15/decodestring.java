import java.util.*;
public class decodestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to decode:");
        String s = sc.next();
        s.toUpperCase(); 
        char[] sarr = s.toCharArray();
        for (char c : sarr) {
            System.out.printf("%d ", (c - 64));
        }
    }
}
