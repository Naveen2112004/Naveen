public class rowwiseandcolumnwise {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0, c = cols - 1;
        while (r < rows && c >= 0) {
            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] > target)
                c--; 
            else
                r++; 
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 29;
        System.out.println(searchMatrix(matrix, target));
    }
}
