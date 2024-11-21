package org.dcistudent.models.university;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter @Setter
public class Student {
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Grade is mandatory")
    private Double grade = 0.0;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", grade=" + this.grade +
                '}';
    }
}
