package model;

import java.util.HashMap;

public class Inventory {
    private String productName;
    private int quantity;

    HashMap<String, Integer> hashMap = new HashMap<>();

    public void addProduct(String productName, int quantity) {
        this.hashMap.put(productName, quantity);
    }

    public void removeProduct(String productName) {
        hashMap.remove(productName);
    }

    public int checkInventory(String productName) {
        return hashMap.get(productName);
    }

    public void listAllProducts() {
        System.out.println(hashMap);
    }
}
