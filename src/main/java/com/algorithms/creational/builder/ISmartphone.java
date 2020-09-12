package com.algorithms.creational.builder;

public interface ISmartphone {


    BaseSmartphone smartphone = new BaseSmartphone();
    void model(String model);
    void getDimensions(Dimensions dimensions);
    void getScreen(Screen screen);
    void getMemory(int memory);
    void getRamMemory(int ram);
    void radio();
    void gps();
    void tv();

    default BaseSmartphone build(){
        return smartphone;
    }


}
