package com.algorithms.creational.factory.employee;

import com.algorithms.creational.factory.employee.contracts.IManualWork;

public class ManualEmployee implements IManualWork {

    @Override
    public String getContext() {
        return "Selecting the products..";
    }
}
