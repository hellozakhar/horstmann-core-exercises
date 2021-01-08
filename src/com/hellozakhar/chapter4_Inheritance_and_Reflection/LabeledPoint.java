package com.hellozakhar.chapter4_Inheritance_and_Reflection;

import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        LabeledPoint LPoint = (LabeledPoint) o;
        return label == null && LPoint == null || label != null && label.equals(LPoint.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLabel());
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
