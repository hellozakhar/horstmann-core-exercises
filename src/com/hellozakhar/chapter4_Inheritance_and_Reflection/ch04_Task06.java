/* Suppose that in Section 4.2.2, “The equals Method” (page 148),
 * the Item.equals method uses an instanceof test.
 * Implement DiscountedItem.equals so that it compares
 * only the superclass if otherObject is an Item,
 * but also includes the discount if it is a DiscountedItem.
 * Show that this method preserves symmetry but fails
 * to be transitive—that is, find a combination of items and
 * discounted items so that x.equals(y) and y.equals(z),
 * but not x.equals(z).*/

package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class ch04_Task06 {
    public static void main(String[] args) {
        Item item = new Item("Macbook Pro 2020", 2000);
        DiscountedItem ditem1 = new DiscountedItem("Macbook Pro 2020", 2000, 100);
        DiscountedItem ditem2 = new DiscountedItem("Macbook Pro 2020", 2000, 2001);

        System.out.println(ditem1.equals(item));   // -> true
        System.out.println(item.equals(ditem2));   // -> true
        System.out.println(ditem1.equals(ditem2)); // -> false
    }
}
