package com.algorithms.creational.factory.car.factories;

import com.algorithms.creational.factory.car.FiatCar;
import com.algorithms.creational.factory.car.FordCar;
import com.algorithms.creational.factory.car.contracts.AbstractFuelBaseCar;
import com.algorithms.creational.factory.car.contracts.CarEnum;
import com.algorithms.creational.factory.car.contracts.IFuelCarFactory;

import java.util.HashMap;
import java.util.Map;

public class FuelCarFactory implements IFuelCarFactory<AbstractFuelBaseCar> {

    @Override
    public AbstractFuelBaseCar build(String model, int year, int gasTankSize, CarEnum type) {
        return this.bind(model, year, gasTankSize).get(type);
    }

    private Map<CarEnum, AbstractFuelBaseCar> bind(String model, int year, int gasTankSize){
        HashMap<CarEnum, AbstractFuelBaseCar> cars = new HashMap<>();
        cars.put(CarEnum.FIAT, new FiatCar(model, year, gasTankSize));
        cars.put(CarEnum.FORD, new FordCar(model, year, gasTankSize));
        return cars;
    }
}
