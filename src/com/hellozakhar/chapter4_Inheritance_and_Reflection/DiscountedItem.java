package com.hellozakhar.chapter4_Inheritance_and_Reflection;

import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this.getClass() == o.getClass()) {
            DiscountedItem ditem = (DiscountedItem) o;
            return discount == ditem.discount;
        } else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}

