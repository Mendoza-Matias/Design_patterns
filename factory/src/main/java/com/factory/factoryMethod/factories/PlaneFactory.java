package com.factory.factoryMethod.factories;

import com.factory.factoryMethod.Vehicle;
import com.factory.factoryMethod.impl.Plane;

public class PlaneFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
       return new Plane();
    }

}
