package com.algorithms.creational.factory.car;

import com.algorithms.creational.factory.car.contracts.AbstractEletricBaseCar;

public class TeslaCar extends AbstractEletricBaseCar {

    public TeslaCar(String model, int year) {
        super(model, year);
    }

    @Override
    public void chargeBattery() {

    }

    @Override
    public void batteryChange() {

    }
}
