package com.algorithms.creational.factory.car.app;

import com.algorithms.creational.factory.car.contracts.AbstractFuelBaseCar;
import com.algorithms.creational.factory.car.contracts.CarEnum;
import com.algorithms.creational.factory.car.factories.FuelCarFactory;

public class Main {

    public static void main(String[] args) {
        FuelCarFactory fuelCarFactory = new FuelCarFactory();
        AbstractFuelBaseCar fiatCar = fuelCarFactory.build("Teste", 2020, 20, CarEnum.FIAT);
        System.out.println(fiatCar.getGasTankSize());
    }
}
