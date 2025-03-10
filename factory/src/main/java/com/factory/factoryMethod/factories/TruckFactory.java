package com.factory.factoryMethod.factories;

import com.factory.factoryMethod.Vehicle;
import com.factory.factoryMethod.impl.Truck;

public class TruckFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
       return new Truck();
    }

}
