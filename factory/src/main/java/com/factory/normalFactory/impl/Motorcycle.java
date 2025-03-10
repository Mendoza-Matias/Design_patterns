package com.factory.normalFactory.impl;

import com.factory.normalFactory.Vehicle;

public class Motorcycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Run motorcycle.");
    }

    @Override
    public void stop() {
        System.out.println("Stop motorcycle.");
    }

}
