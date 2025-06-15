public class productoftwomatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{7,8},{9,10},{11,12}};
        int[][] p = new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b[0].length;j++)
                for(int k=0;k<a[0].length;k++)
                    p[i][j]+=a[i][k]*b[k][j];
        for(int[] r:p){
            for(int v:r) System.out.print(v+" ");
            System.out.println();
        }
    }
}