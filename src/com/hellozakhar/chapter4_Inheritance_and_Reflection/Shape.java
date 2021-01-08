package com.hellozakhar.chapter4_Inheritance_and_Reflection;

abstract public class Shape {
    Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    abstract public Point getCenter();
}
