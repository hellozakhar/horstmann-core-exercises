/* Define toString, equals, and hashCode methods for the classes of the preceding exercise. */

package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class ch04_Task02 {
    public static void main(String[] args) {
        LabeledPoint lpt1 = new LabeledPoint("point 1", 1.0, 2.5);
        LabeledPoint lpt2 = new LabeledPoint("point 1", 1.0, 2.5);
        LabeledPoint lpt3 = new LabeledPoint("point 3", 4.0, -1.0);
        System.out.println(lpt1);
        System.out.println(lpt2);
        System.out.println(lpt3);

        System.out.println(lpt1.hashCode());
        System.out.println(lpt2.hashCode());
        System.out.println(lpt3.hashCode());

        System.out.println("lpt1.equals(lpt2): " + lpt1.equals(lpt2));
        System.out.println("lpt2.equals(lpt3): " + lpt2.equals(lpt3));
        System.out.println("lpt3.equals(lpt1): " + lpt3.equals(lpt1));
    }
}
