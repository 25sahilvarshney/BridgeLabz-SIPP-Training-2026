package Level2;

import java.util.*;

public class ShoppingCartApp {
    static class CartItem {
        private String itemName;
        private double price;
        private int quantity;

        public CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public double totalCost() {
            return price * quantity;
        }

        public String getName() {
            return itemName;
        }

        public void display() {
            System.out.printf("%s x%d - Rs.%.2f\n", itemName, quantity, totalCost());
        }
    }

    static class Cart {
        private List<CartItem> items = new ArrayList<>();

        public void addItem(CartItem item) {
            items.add(item);
            System.out.println("Added: " + item.getName());
        }

        public void removeItem(String itemName) {
            Iterator<CartItem> it = items.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equalsIgnoreCase(itemName)) {
                    it.remove();
                    System.out.println("Removed: " + itemName);
                    return;
                }
            }
            System.out.println("Item not found: " + itemName);
        }

        public double totalCost() {
            double total = 0.0;
            for (CartItem c : items) total += c.totalCost();
            return total;
        }

        public void displayCart() {
            System.out.println("Shopping Cart:");
            if (items.isEmpty()) System.out.println("(empty)");
            for (CartItem c : items) c.display();
            System.out.println("Total: Rs." + String.format("%.2f", totalCost()));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new CartItem("Pen", 12.50, 3));
        cart.addItem(new CartItem("Notebook", 65.00, 2));
        cart.displayCart();
        cart.removeItem("Pen");
        cart.displayCart();
    }
}
