package com.algorithms.creational.factory.employee.factories;

import com.algorithms.creational.factory.employee.ManualEmployee;
import com.algorithms.creational.factory.employee.contracts.EmployeeType;
import com.algorithms.creational.factory.employee.contracts.IManualWork;
import com.algorithms.creational.factory.employee.contracts.IManualWorkFactory;

import java.util.HashMap;
import java.util.Map;

public class ManualWorkFactory implements IManualWorkFactory {

    @Override
    public IManualWork build(EmployeeType type) {
        return this.bind().get(type);
    }

    private Map<EmployeeType, IManualWork> bind(){
        HashMap<EmployeeType, IManualWork> employees = new HashMap<>();
        employees.put(EmployeeType.MANUAL, new ManualEmployee());
        return employees;
    }
}
