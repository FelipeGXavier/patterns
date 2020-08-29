package com.algorithms.creational.factory.employee.contracts;

public interface IManualWorkFactory {

    IManualWork build(EmployeeType type);
}
