package org.dcistudent.models.inventory;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter @Setter
public class Product {
    @NotBlank(message = "Product name is mandatory")
    private String name;
    @Min(value = 0, message = "Quantity must be greater than 0")
    private int quantity = 0;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + this.name + '\'' +
                ", quantity=" + this.quantity +
                '}';
    }
}
