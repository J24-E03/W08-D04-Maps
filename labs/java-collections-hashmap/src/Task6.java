import model.Inventory;

public class Task6 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Milk", 2);
        inventory.addProduct("Tea", 4);
        inventory.addProduct("Bread", 3);
        inventory.listAllProducts();

        inventory.removeProduct("Tea");
        inventory.listAllProducts();

        System.out.println(inventory.checkInventory("Bread"));
    }
}
