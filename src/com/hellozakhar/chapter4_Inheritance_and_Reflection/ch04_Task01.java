/* Define a class Point with a constructor public Point(double x, double y)
 * and accessor methods getX, getY. Define a subclass LabeledPoint
 * with a constructor public LabeledPoint(String label, double x, double y)
 * and an accessor method getLabel. */

package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class ch04_Task01 {
    public static void main(String[] args) {
        LabeledPoint lpt1 = new LabeledPoint("point 1", 1.0, 1.0);
        System.out.println(lpt1.getLabel());
    }
}
