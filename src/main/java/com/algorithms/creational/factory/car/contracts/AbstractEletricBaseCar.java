package com.algorithms.creational.factory.car.contracts;

abstract public class AbstractEletricBaseCar implements IEletricCar {

    protected final String model;
    protected final int year;

    public AbstractEletricBaseCar(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

}
