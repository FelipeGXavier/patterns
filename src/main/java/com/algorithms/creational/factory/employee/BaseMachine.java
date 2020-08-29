package com.algorithms.creational.factory.employee;

import java.util.ArrayList;
import java.util.List;

abstract public class BaseMachine {

    protected String model;
    protected List<String> features = new ArrayList<>();

    public BaseMachine(String model) {
        this.model = model;
    }

    abstract public void addFeature(String feature);

}
