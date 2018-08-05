package com.cpinelli.dependencyinjection.model;

public class Garnish {

    private String name;

    private int quantity; // in grams

    private String type; // "meat", "vegetable", "sauce" or "cheese"

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
