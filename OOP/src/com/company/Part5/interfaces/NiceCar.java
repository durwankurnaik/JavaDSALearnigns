package com.company.Part5.interfaces;

public class NiceCar  {
    private Engine engine;
    private final Sound player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        engine = new ElectricEngine();
    }
}
