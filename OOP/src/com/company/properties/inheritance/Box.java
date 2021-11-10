package com.company.properties.inheritance;

public class Box {
    double l, w, h;

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(BoxWeight other) {
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }

    @Override
    public String toString() {
        return "Box{ " +
                "l = " + l +
                ", w = " + w +
                ", h = " + h +
                " }";
    }
}
