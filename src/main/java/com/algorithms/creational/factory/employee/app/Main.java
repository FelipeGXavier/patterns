package com.algorithms.creational.factory.employee.app;

import com.algorithms.creational.factory.employee.contracts.EmployeeType;
import com.algorithms.creational.factory.employee.contracts.IMachineWork;
import com.algorithms.creational.factory.employee.contracts.IMachineWorkFactory;
import com.algorithms.creational.factory.employee.factories.MachineFactory;
import com.algorithms.creational.factory.employee.factories.ManualWorkFactory;

public class Main {

    public static void main(String[] args) {
        IMachineWorkFactory factory = new MachineFactory();
        IMachineWork worker = factory.build("Teste", EmployeeType.OVEN);
        worker.addFeature("Turn on");
        System.out.println(worker.getMachineFeatures().size());

        System.out.println(new ManualWorkFactory().build(EmployeeType.MANUAL).getContext());

    }
}
