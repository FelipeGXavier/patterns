package com.algorithms.creational.factory.employee.contracts;

import java.util.List;

public interface IMachineWork {

    List<String> getMachineFeatures();
    String getModel();
    void addFeature(String feature);
}
