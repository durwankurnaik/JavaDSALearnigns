package com.company.Part5.interfaces;

public class CDPlayer implements Sound {

    @Override
    public void start() {
        System.out.println("Media start");
    }

    @Override
    public void stop() {
        System.out.println("Media stop");
    }
}
