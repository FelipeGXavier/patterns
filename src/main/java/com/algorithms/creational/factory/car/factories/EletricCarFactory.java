package com.algorithms.creational.factory.car.factories;

import com.algorithms.creational.factory.car.TeslaCar;
import com.algorithms.creational.factory.car.contracts.AbstractEletricBaseCar;
import com.algorithms.creational.factory.car.contracts.CarEnum;
import com.algorithms.creational.factory.car.contracts.IEletricCarFactory;

import java.util.HashMap;
import java.util.Map;

public class EletricCarFactory implements IEletricCarFactory<AbstractEletricBaseCar> {


    @Override
    public AbstractEletricBaseCar build(String model, int year, CarEnum type) {
        return this.bind(model, year).get(type);
    }

    private Map<CarEnum, AbstractEletricBaseCar> bind(String model, int year){
        HashMap<CarEnum, AbstractEletricBaseCar> cars = new HashMap<>();
        cars.put(CarEnum.TESLA, new TeslaCar(model, year));
        return cars;
    }
}
