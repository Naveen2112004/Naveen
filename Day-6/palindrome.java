public class palindrome {
    public static void main(String[] args) {
        String str = "malayalam", reverseStr = "";
        char[] arr = str.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
        }        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}