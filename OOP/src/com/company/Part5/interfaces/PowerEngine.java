package com.company.Part5.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerates");
    }
}
