public class countnegativesinsortedmatrix {
    public static int countNegatives(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] < 0) count++;
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {{-3,-2,-1,1}, {-2,2,3,4}, {4,5,7,8}};
        System.out.println(countNegatives(matrix));
    }
}
