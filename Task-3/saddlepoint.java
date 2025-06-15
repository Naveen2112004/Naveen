public class saddlepoint {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        boolean found = false;
        for (int i = 0; i < m.length; i++) {
            int minCol = 0;
            for (int j = 1; j < m[0].length; j++)
                if (m[i][j] < m[i][minCol]) minCol = j;
            int val = m[i][minCol];
            boolean saddle = true;
            for (int k = 0; k < m.length; k++)
                if (m[k][minCol] > val) saddle = false;
            if (saddle) {
                System.out.println("Saddle point: " + val);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No saddle point exists.");
    }
}
