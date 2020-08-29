package com.algorithms.creational.factory.car.contracts;

abstract public class AbstractFuelBaseCar implements IFuelCar {

    protected final String model;
    protected final int year;
    protected final int gasTankSize;

    public AbstractFuelBaseCar(String model, int year, int gasTankSize) {
        this.model = model;
        this.year = year;
        this.gasTankSize = gasTankSize;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getGasTankSize() {
        return gasTankSize;
    }
}
