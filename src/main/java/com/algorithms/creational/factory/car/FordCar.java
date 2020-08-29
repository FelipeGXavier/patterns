package com.algorithms.creational.factory.car;

import com.algorithms.creational.factory.car.contracts.AbstractFuelBaseCar;

public class FordCar extends AbstractFuelBaseCar {


    public FordCar(String model, int year, int gasTankSize) {
        super(model, year, gasTankSize);
    }

    @Override
    public void supplyFuel() {

    }
}
