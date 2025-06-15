public class transposingamatrix {
    public static int[][] transpose(int[][] m) {
        int r = m.length, c = m[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = m[i][j];
        return t;
    }
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6}};
        int[][] t = transpose(m);
        for (int[] row : t) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
}
