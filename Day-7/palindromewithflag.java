import java.util.Scanner;
public class palindromewithflag {
    public static boolean isPalindrome(String str) {
        char arr[] = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            
            if (str == null || str.trim().isEmpty()) {
                System.out.println("Please enter a valid string");
                return;
            }
            System.out.println(isPalindrome(str) ? "Palindrome" : "Not a Palindrome");
        } finally {
            sc.close();
        }
    }
}