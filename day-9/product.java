import java.util.Scanner;
public class product {
    private String name;
    private double price;
    private int quantity;
    public product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        product rice = new product("Rice", 399);
        System.out.println("Welcome to Anantha Mart!");
        System.out.println("Available Product:");
        System.out.println(rice.name + " - Rs." + rice.price);
        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        rice.quantity = qty;
        double total = rice.price * qty;
        System.out.println("-------Bill-------");
        System.out.println(rice.name + " x" + qty + " = Rs." + total);
        scanner.close();
    }
}
