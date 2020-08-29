package com.algorithms.creational.factory.car.contracts;

public interface IEletricCarFactory<T extends AbstractEletricBaseCar & IEletricCar> {

    T build(String model, int year, CarEnum type);
}
