import java.util.*;
class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class ShoppingCart {  
    private final ArrayList<Product> items = new ArrayList<>();
    public void addItem(Product product) { 
        items.add(product);
        System.out.println(product.name + " added to cart.");
    }
    public void removeItem(String productName) {
        items.removeIf(item -> item.name.equals(productName));
        System.out.println(productName + " removed from cart.");
    }    
    public void displayCart() { 
        System.out.println("\nYour Cart:");
        if (items.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }
        items.forEach(item -> System.out.println("- " + item.name + " : $" + item.price));
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();        
        cart.addItem(new Product("Washing Machine", 499.99));
        cart.addItem(new Product("Refrigerator", 899.99));
        cart.addItem(new Product("Microwave Oven", 199.99));
        cart.displayCart();
        cart.removeItem("Refrigerator");
        cart.displayCart();
        cart.addItem(new Product("Air Conditioner", 599.99));
        cart.displayCart();
        cart.removeItem("Washing Machine");
        cart.displayCart();
    }
}
