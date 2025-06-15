import java.util.Scanner;
public class hii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        float  f = sc.nextFloat();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("This is what you entered "+(++a));
        System.out.println("This is what you entered "+f);
        System.out.println("This is what you entered "+d);
        System.out.println("This is what you entered "+s);
    }
}