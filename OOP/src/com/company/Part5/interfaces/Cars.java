package com.company.Part5.interfaces;

public class Cars implements Engine, Brakes, Sound {

    @Override
    public void brakes() {
        System.out.println("I am the car brakes");
    }

    @Override
    public void start() {
        System.out.println("I am how the car starts");
    }

    @Override
    public void stop() {
        System.out.println("I am how the car stops");
    }

    @Override
    public void acc() {
        System.out.println("I am how the car acclerates");
    }

    public static void main(String[] args) {
        Cars obj = new Cars();

        obj.start();
        obj.stop();
        obj.brakes();
    }
}
