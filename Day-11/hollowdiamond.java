class hollowdiamond {
    public static void main(String[] args) {
        int n = 5;
        for(int i = -n + 1; i < n; i++) {
            int abs = Math.abs(i);
            for(int j = 0; j < abs; j++) System.out.print(" ");
            System.out.print("*");
            if(2 * (n - abs) - 3 > 0) {
                for(int j = 0; j < 2 * (n - abs) - 3; j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
