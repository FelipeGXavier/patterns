package com.algorithms.creational.factory.employee;

import com.algorithms.creational.factory.employee.contracts.IMachineWork;

import java.util.List;

public class OvenMachine extends BaseMachine implements IMachineWork {

    public OvenMachine(String model) {
        super(model);
    }

    @Override
    public void addFeature(String feature) {
        this.features.add(feature);
    }

    @Override
    public List<String> getMachineFeatures() {
        return this.features;
    }

    @Override
    public String getModel() {
        return this.model;
    }


}
