public class findmissingnumber {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 5};
        int missing = findMissing(input);
        System.out.println("Missing number: " + missing);
    }
}
