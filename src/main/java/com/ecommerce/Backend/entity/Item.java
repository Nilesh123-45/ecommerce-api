package com.ecommerce.Backend.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Item {

    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Size(min = 10, max = 200)
    private String description;

    public Item() {
    }

    public Item(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}