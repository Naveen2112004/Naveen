public class counteven {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 19, 3, 7, 4};
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);
    }
}
