package com.algorithms.creational.factory.employee.contracts;

public interface IMachineWorkFactory {

    IMachineWork build(String model, EmployeeType type);
}
