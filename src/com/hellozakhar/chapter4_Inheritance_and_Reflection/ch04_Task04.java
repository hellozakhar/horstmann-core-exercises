/* Define an abstract class Shape with an instance variable of class Point,
 * a constructor, a concrete method public void moveBy(double dx, double dy)
 * that moves the point by the given amount, and an
 * abstract method public Point getCenter().
 * Provide concrete subclasses Circle, Rectangle, Line
 * with constructors public Circle(Point center, double radius),
 * public Rectangle(Point topLeft, double width, double height), and
 * public Line(Point from, Point to). */

package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class ch04_Task04 {
    public static void main(String[] args) {
        System.out.println("Circle Class Test");
        // creating circle with center point x=2, y=2 and radius = 7
        Circle circle = new Circle(new Point(2,2), 7);
        System.out.println(circle.getCenter());
        circle.moveBy(4, 8);
        System.out.println(circle.getCenter());

        System.out.println("\nRectangle Class Test");
        Rectangle rectangle = new Rectangle(new Point(1, 1), 5, 8);
        System.out.println(rectangle.getCenter());
        rectangle.moveBy(1, 2);
        System.out.println(rectangle.getCenter());

        System.out.println("\nLine Class Test");
        Line line = new Line(new Point(0,0), new Point(5, 5));
        System.out.println(line.getCenter());
        line.moveBy(5, -2);
        System.out.println(line.getCenter());
    }
}
