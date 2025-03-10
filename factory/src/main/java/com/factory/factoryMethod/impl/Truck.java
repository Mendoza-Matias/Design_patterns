package com.factory.factoryMethod.impl;

import com.factory.factoryMethod.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Run truck.");
    }

    @Override
    public void stop() {
        System.out.println("Stop truck.");
    }
}
