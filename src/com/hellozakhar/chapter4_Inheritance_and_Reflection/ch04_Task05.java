/* Define clone methods for the classes of the preceding exercise. */

package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class ch04_Task05 {
    public static void main(String[] args) {
        Line line = new Line(new Point(0,0), new Point(1,1));
        Line line2 = line.clone();
        System.out.println("line center: " + line.getCenter());
        System.out.println("clone line center: " + line2.getCenter());
    }
}
