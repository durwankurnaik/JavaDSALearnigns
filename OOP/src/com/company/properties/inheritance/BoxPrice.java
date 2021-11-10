package com.company.properties.inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    public BoxPrice(double l, double w ,double h, double weight, double price) {
        super(l, w, h, weight);
        this.price = price;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    @Override
    public String toString() {
        return "BoxPrice{ " +
                "l = " + l +
                ", w = " + w +
                ", h = " + h +
                ", price = " + price +
                ", weight = " + weight +
                " }";
    }
}
