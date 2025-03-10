package com.factory.normalFactory;

import com.factory.normalFactory.factories.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle("Car");

        car.start();
        car.stop();

        Vehicle truck = vehicleFactory.createVehicle("Truck");
        truck.start();
        truck.stop();
    }
}