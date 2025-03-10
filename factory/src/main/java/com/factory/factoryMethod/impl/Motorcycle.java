package com.factory.factoryMethod.impl;

import com.factory.factoryMethod.Vehicle;

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
