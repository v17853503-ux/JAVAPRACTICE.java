class Product {
    String name;
    double price;
    int quantity;

    double totalValue() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("Product: " + name + " | Price: $" + price + " | Qty: " + quantity + " | Total Value: $" + totalValue());
    }
}

public class ProductEx3 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Laptop";
        p1.price = 850.00;
        p1.quantity = 5;

        Product p2 = new Product();
        p2.name = "Mouse";
        p2.price = 25.50;
        p2.quantity = 30;

        Product p3 = new Product();
        p3.name = "Keyboard";
        p3.price = 45.00;
        p3.quantity = 15;

        System.out.println("--- Product Stock Values ---");
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
    }
}
