package com.algorithms.creational.builder;

public class SmartphoneDirector {

    private ISmartphone smartphoneBuilder;

    public SmartphoneDirector(ISmartphone smartphoneBuilder) {
        this.smartphoneBuilder = smartphoneBuilder;
    }

    public void build(
            Dimensions dimensions,
            Screen screen,
            String model,
            int memory,
            int ramMemory){
        smartphoneBuilder.getDimensions(dimensions);
        smartphoneBuilder.getMemory(memory);
        smartphoneBuilder.getScreen(screen);
        smartphoneBuilder.model(model);
        smartphoneBuilder.getRamMemory(ramMemory);
        smartphoneBuilder.radio();
        smartphoneBuilder.gps();
        smartphoneBuilder.tv();
    }

    public BaseSmartphone get(){
        return this.smartphoneBuilder.build();
    }
}
