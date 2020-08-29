package com.algorithms.creational.factory.car.contracts;


public interface IFuelCarFactory<T extends AbstractFuelBaseCar & IFuelCar> {

    T build(String model, int year, int gasTankSize, CarEnum type);

}
