package com.factory.factoryMethod.impl;

import com.factory.factoryMethod.Vehicle;

public class Plane implements Vehicle {
    @Override
    public void start() {
        System.out.println("Run plane.");
    }

    @Override
    public void stop() {
        System.out.println("Stop plane.");
    }

    // Tambien puedo tener otros metodos
    public void fly() {
        System.out.println("Take of the plane");
    }
}
