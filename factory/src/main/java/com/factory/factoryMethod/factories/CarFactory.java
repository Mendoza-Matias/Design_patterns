package com.factory.factoryMethod.factories;

import com.factory.factoryMethod.Vehicle;
import com.factory.factoryMethod.impl.Car;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
       return  new Car();
    }

}
