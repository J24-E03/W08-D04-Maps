import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    private final HashMap<String, Integer> inventory = new HashMap<>();

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        // Add some products
        inventorySystem.addProduct("Apple", 50);
        inventorySystem.addProduct("Banana", 30);
        inventorySystem.addProduct("Orange", 20);

        // Check inventory for a product
        inventorySystem.checkInventory("Apple");

        // List all products in the inventory
        inventorySystem.listAllProducts();

        // Remove a product
        inventorySystem.removeProduct("Banana");

        // List all products after removal
        inventorySystem.listAllProducts();
    }

    // Method to add a product or update its quantity
    public void addProduct(String productName, int quantity) {
        if (inventory.containsKey(productName)) {
            // If the product exists, update the quantity
            inventory.put(productName, inventory.get(productName) + quantity);
            System.out.println("Updated " + productName + " quantity to " + inventory.get(productName));
        } else {
            // If the product doesn't exist, add it to the inventory
            inventory.put(productName, quantity);
            System.out.println("Added " + productName + " with quantity " + quantity);
        }
    }

    // Method to remove a product from the inventory
    public void removeProduct(String productName) {
        if (inventory.containsKey(productName)) {
            inventory.remove(productName);
            System.out.println("Removed " + productName + " from the inventory.");
        } else {
            System.out.println(productName + " is not in the inventory.");
        }
    }

    // Method to check the quantity of a specific product
    public void checkInventory(String productName) {
        if (inventory.containsKey(productName)) {
            System.out.println("The quantity of " + productName + " is: " + inventory.get(productName));
        } else {
            System.out.println(productName + " is not in the inventory.");
        }
    }

    // Method to list all products and their quantities
    public void listAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("All products in inventory:");
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
