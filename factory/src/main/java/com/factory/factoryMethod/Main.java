package com.factory.factoryMethod;

import com.factory.factoryMethod.factories.CarFactory;
import com.factory.factoryMethod.factories.MotorcycleFactory;
import com.factory.factoryMethod.factories.PlaneFactory;
import com.factory.factoryMethod.factories.TruckFactory;
import com.factory.factoryMethod.impl.Plane;

public class Main {
    public static void main(String[] args) {

        // llamo a las clases fabrica

        Vehicle car = new CarFactory().createVehicle();

        Vehicle truck = new TruckFactory().createVehicle();

        Vehicle motorcycle = new MotorcycleFactory().createVehicle();

        Plane plane = (Plane) new PlaneFactory().createVehicle();

        // ---
        car.start();
        car.stop();

        truck.start();
        truck.stop();

        motorcycle.start();
        motorcycle.stop();

        plane.start();
        plane.stop();
        plane.fly();
    }
}
