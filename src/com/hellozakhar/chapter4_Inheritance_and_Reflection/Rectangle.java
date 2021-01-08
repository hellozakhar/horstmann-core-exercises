package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.x + width / 2, point.y - height / 2);
    }

    public Rectangle clone() {
        return new Rectangle(new Point(point.x, point.y), width, height);
    }
}
