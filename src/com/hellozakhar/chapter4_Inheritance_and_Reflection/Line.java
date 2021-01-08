package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx,dy);
        to.x += dx;
        to.y += dy;
    }

    @Override
    public Point getCenter() {
        return new Point((point.x + to.x) / 2, (point.y + to.y) / 2);
    }

    public Line clone() {
        return new Line(new Point(point.x, point.y), new Point(to.x, to.y));
    }
}
