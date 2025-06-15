public class maxsumsubmatrix {
    public static int maxSumSubmatrix(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        for (int left = 0; left < matrix[0].length; left++) {
            int[] rowSum = new int[matrix.length];
            for (int right = left; right < matrix[0].length; right++) {
                for (int i = 0; i < matrix.length; i++) {
                    rowSum[i] += matrix[i][right];
                }
                maxSum = Math.max(maxSum, kadane(rowSum));
            }
        }
               return maxSum;
    }
    private static int kadane(int[] arr) {
        int maxSoFar = arr[0], sum = arr[0];
        for (int num : arr) 
            sum = Math.max(num, sum + num);
            maxSoFar = Math.max(maxSoFar, sum);
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,-2,-1}, {-3,4,6}, {2,-1,-3}};
        System.out.println("Maximum sum: " + maxSumSubmatrix(matrix));
    }
}
