package com.factory.normalFactory.impl;

import com.factory.normalFactory.Vehicle;

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
