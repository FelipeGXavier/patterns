package com.algorithms.creational.factory.employee;

import com.algorithms.creational.factory.employee.contracts.IMachineWork;

import java.util.ArrayList;
import java.util.List;

public class WashMachine extends BaseMachine implements IMachineWork {

    public WashMachine(String model) {
        super(model);
    }

    @Override
    public void addFeature(String feature) {
        this.features.add(feature);
    }

    @Override
    public List<String> getMachineFeatures() {
        return new ArrayList<>();
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
