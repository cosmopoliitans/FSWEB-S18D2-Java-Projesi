package com.workintech.fruitvegetable.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass

public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 2, max = 45)
    private String name;

    @Column(name = "price")
    @NotNull
    @NotEmpty
    @NotBlank
    @DecimalMin("10")
    private double price;
}
