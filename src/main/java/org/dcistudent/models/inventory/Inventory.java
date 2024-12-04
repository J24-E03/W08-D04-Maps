package org.dcistudent.models.inventory;

import jakarta.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products = new HashMap<>();

    public Inventory addProduct(@NotNull Product product) {
        this.products.put(product.getName(), product);

        return this;
    }

    public Inventory removeProduct(@NotBlank String name) {
        this.products.remove(name);

        return this;
    }

    public Integer getQuantity(@NotBlank String name) {
        return this.products.get(name).getQuantity();
    }

    public String getAll() {
        return this.products.toString();
    }
}
