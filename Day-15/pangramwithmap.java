import java.util.*;
public class pangramwithmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a pangram:");
        String s = sc.nextLine().toLowerCase();
        Map<Character, Boolean> letterMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letterMap.put(c, true);
            }
        }
        if (letterMap.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a pangram");
        }
    }
}
