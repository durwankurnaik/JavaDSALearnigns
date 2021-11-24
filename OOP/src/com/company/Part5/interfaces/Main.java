package com.company.Part5.interfaces;

public class Main {
    public static void main(String[] args) {
//        Sound obj = new Cars();
//        obj.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
