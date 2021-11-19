package com.company.Part3_properties.inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice(double l, double w ,double h, double weight, double price) {
        super(l, w, h, weight);
        this.price = price;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }
    // Above two methods(constructor) are example of method overloading

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
