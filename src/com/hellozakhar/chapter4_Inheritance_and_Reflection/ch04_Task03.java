/* Make the instance variables x and y of the Point
 * class in Exercise 1 protected.
 * Show that the LabeledPoint class
 * can access these variables only in LabeledPoint instances.*/

package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class ch04_Task03 {
    public static void main(String[] args) {
        LabeledPoint lpt1 = new LabeledPoint("point 1", 1.0, 2.5);
        // can access
        System.out.println(lpt1.x);
    }
}
