package com.factory.normalFactory.factories;

import com.factory.normalFactory.Vehicle;
import com.factory.normalFactory.impl.Car;
import com.factory.normalFactory.impl.Motorcycle;
import com.factory.normalFactory.impl.Plane;
import com.factory.normalFactory.impl.Truck;

//clase fabrica (Creacional)
public class VehicleFactory {

    // Metodo que retornara un vehiculo (Cualquiera de todos ellos)
    public Vehicle createVehicle(String typeOfVehicle) {

        if (typeOfVehicle.equalsIgnoreCase("Car")) {
            return new Car();
        }
        if (typeOfVehicle.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        }
        if (typeOfVehicle.equalsIgnoreCase("Truck")) {
            return new Truck();
        }
        if (typeOfVehicle.equalsIgnoreCase("Plane")) {
            return new Plane();
        }
        return null;
    }
}
