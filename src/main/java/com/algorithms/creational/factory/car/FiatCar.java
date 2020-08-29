package com.algorithms.creational.factory.car;

import com.algorithms.creational.factory.car.contracts.AbstractFuelBaseCar;

public class FiatCar extends AbstractFuelBaseCar {

    public FiatCar(String model, int year, int gasTankSize) {
        super(model, year, gasTankSize);
    }

    @Override
    public void supplyFuel() {

    }
}
