package com.hellozakhar.chapter4_Inheritance_and_Reflection;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object o) {
        // A quick test to see if the objects are identical
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        // Test whether the instance variables have identical values
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && Objects.equals(description, item.description);
    }

    public int hashCode() {
        return Objects.hash(description, price);
    }
}