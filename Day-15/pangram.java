import java.util.*;
public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a pangram:");
        String s = sc.nextLine().toLowerCase();
        Set<Character> letters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        if (letters.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a pangram");
        }
    }
}
