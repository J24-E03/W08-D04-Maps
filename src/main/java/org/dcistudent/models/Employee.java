package org.dcistudent.models;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter
public class Employee {
    @NotNull(message = "Employee id is mandatory")
    private Integer id;
    @NotBlank(message = "Employee name is mandatory")
    private String name;
    @NotNull(message = "Employee salary is mandatory") @Min(value = 2200, message = "Salary must be greater than 2200")
    private Double salary;
    public static final Double SALARY_MAX = 5000.0;
}
