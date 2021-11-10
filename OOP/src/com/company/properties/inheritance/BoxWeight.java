package com.company.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double l, double w ,double h, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    @Override
    public String toString() {
        return "BoxWeight{ " +
                "l = " + l +
                ", w = " + w +
                ", h = " + h +
                ", weight = " + weight +
                " }";
    }
}
