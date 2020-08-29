package com.algorithms.creational.factory.employee.factories;

import com.algorithms.creational.factory.employee.OvenMachine;
import com.algorithms.creational.factory.employee.WashMachine;
import com.algorithms.creational.factory.employee.contracts.EmployeeType;
import com.algorithms.creational.factory.employee.contracts.IMachineWork;
import com.algorithms.creational.factory.employee.contracts.IMachineWorkFactory;

import java.util.HashMap;
import java.util.Map;

public class MachineFactory implements IMachineWorkFactory {

    @Override
    public IMachineWork build(String model, EmployeeType type) {
        return this.bind(model).get(type);
    }

    private Map<EmployeeType, IMachineWork> bind(String model){
        HashMap<EmployeeType, IMachineWork> machines = new HashMap<>();
        machines.put(EmployeeType.OVEN, new OvenMachine(model));
        machines.put(EmployeeType.WASH, new WashMachine(model));
        return machines;
    }
}
