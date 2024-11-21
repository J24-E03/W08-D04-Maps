import java.util.HashMap;
import java.util.Map;

public class Exercise6 {
    public static Map<String, Integer> products  = new HashMap<>();
    public static void main(String[] args) {
        products.put("product1", 100);
        products.put("product2", 1000);
        products.put("product3", 550);
        products.put("product4", 0);
        products.put("product5", 10);
        products.put("product6", 220);
        products.put("product7", 90);
        products.put("product8", 1120);
        System.out.println("All of my products:");
        System.out.println(products);

        // add or update product
        System.out.println("Add new product: product 9.");
        addProduct("product9", 1200);
        System.out.println(products);

        System.out.println("Update quantity of product1.");
        addProduct("product1", 150);
        System.out.println(products);

        // remove product
        System.out.println("Remove product6.");
        removeProduct("product6");
        System.out.println(products);
        System.out.println("Try to remove a product that doesn't exist: product11.");
        removeProduct("product11");

        // quantity of a specific product
        System.out.println("The quantity of product3: " + checkInventory("product3"));

        // print all products
        listAllProducts();
    }

    public static void addProduct(String productName, int quantity) {
        products.put(productName, quantity);
    }

    public static void removeProduct(String productName) {
        if(!products.containsKey(productName)) {
            System.out.println("product doesn't exist.");
            return;
        }
        products.remove(productName);
    }

   public static int checkInventory(String productName) {
        if (!products.containsKey(productName)) {
            System.err.println("Product doesn't exist.");
            return -1;
        }
        return products.get(productName);
   }

    public static void listAllProducts() {
        System.out.println("List of all products:");
        for (String product : products.keySet()) {
            System.out.println(product);
        }
    }
}
