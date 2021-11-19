package com.company.Part3_properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Square();

        shape.area();
    }
}
