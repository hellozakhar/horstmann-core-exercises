package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class Circle extends Shape {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    public Circle clone() {
        return new Circle(new Point(point.x, point.y), radius);
    }
}
