package Warehouse;

public class WarehouseDemo {

    public static void main(String[] args) {

        Storage<Electronics> storage=new Storage<>();

        storage.addItem(new Electronics("Laptop"));
        storage.addItem(new Electronics("Mobile"));
        storage.addItem(new Electronics("Tablet"));
        storage.addItem(new Electronics("Camera"));
        storage.addItem(new Electronics("Headphones"));

        Storage.displayItems(storage.getItems());
    }
}