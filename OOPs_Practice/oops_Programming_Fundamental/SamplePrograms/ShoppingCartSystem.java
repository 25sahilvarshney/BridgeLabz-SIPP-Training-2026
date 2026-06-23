package samplePrograms;

public class ShoppingCartSystem {
    static class Product {
        private static double discount = 10.0;
        private final String productID;
        private String productName;
        private double price;
        private int quantity;

        public Product(String productName, double price, int quantity, String productID) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
            this.productID = productID;
        }

        public static void updateDiscount(double newDiscount) {
            discount = newDiscount;
        }

        public void displayDetails() {
            if (!(this instanceof Product)) {
                System.out.println("Object is not a Product");
                return;
            }
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: Rs." + String.format("%.2f", price));
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total after discount: Rs." + String.format("%.2f", totalAfterDiscount()));
            System.out.println();
        }

        public double totalAfterDiscount() {
            double total = price * quantity;
            return total - (total * discount / 100.0);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Shirt", 799.00, 2, "P1001");
        Product p2 = new Product("Shoes", 1599.00, 1, "P1002");
        p1.displayDetails();
        p2.displayDetails();
        Product.updateDiscount(15.0);
        System.out.println("Discount updated to 15%\n");
        p1.displayDetails();
        p2.displayDetails();
    }
}
