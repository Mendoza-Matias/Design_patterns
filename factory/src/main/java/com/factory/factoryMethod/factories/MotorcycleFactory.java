package com.factory.factoryMethod.factories;

import com.factory.factoryMethod.Vehicle;
import com.factory.factoryMethod.impl.Motorcycle;

public class MotorcycleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
       return new Motorcycle();
    }

}
