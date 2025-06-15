import java.util.Arrays;
public class rearrangearrayalternately {
    public static int[] rearrangeAlternately(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        boolean toggle = true;
        int index = 0;
        while (start <= end) {
            if (toggle) {
                result[index++] = arr[end--];
            } else {
                result[index++] = arr[start++];
            }
            toggle = !toggle;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = rearrangeAlternately(input);
        System.out.println(Arrays.toString(output));
    }
}
