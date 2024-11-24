import java.util.HashMap;

public class InventorySystem {
    private HashMap<String, Integer> inventory;

    public InventorySystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(String productName, int quantity) {
        if (inventory.containsKey(productName)) {
            inventory.put(productName, inventory.get(productName) + quantity);
            System.out.println(quantity + " units of " + productName + " added. Total: " + inventory.get(productName));
        } else {
            inventory.put(productName, quantity);
            System.out.println(productName + " added with " + quantity + " units.");
        }
    }

    public void removeProduct(String productName) {
        if (inventory.containsKey(productName)) {
            inventory.remove(productName);
            System.out.println(productName + " removed from inventory.");
        } else {
            System.out.println(productName + " does not exist in the inventory.");
        }
    }

    public int checkInventory(String productName) {
        return inventory.getOrDefault(productName, 0);
    }

    public void listAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            inventory.forEach((product, quantity) ->
                    System.out.println("Product: " + product + ", Quantity: " + quantity)
            );
        }
    }

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.addProduct("Apple", 50);
        inventorySystem.addProduct("Banana", 30);
        inventorySystem.addProduct("Apple", 20);

        inventorySystem.listAllProducts();

        System.out.println("Inventory for Banana: " + inventorySystem.checkInventory("Banana"));

        inventorySystem.removeProduct("Banana");
        inventorySystem.listAllProducts();

        System.out.println("Inventory for Orange: " + inventorySystem.checkInventory("Orange"));
    }
}