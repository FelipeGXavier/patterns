package com.algorithms.creational.builder;

public class SmartphoneLG implements ISmartphone {

    @Override
    public void model(String model) {
        smartphone.setModel(model);
    }

    @Override
    public void getDimensions(Dimensions dimensions) {
        smartphone.setDimensions(dimensions);
    }

    @Override
    public void getScreen(Screen screen) {
        smartphone.setScreen(screen);
    }

    @Override
    public void getMemory(int memory) {
        smartphone.setMemory(memory);
    }

    @Override
    public void getRamMemory(int ram) {
        smartphone.setRamMemory(ram);
    }

    @Override
    public void radio() {
        smartphone.setRadio(false);
    }

    @Override
    public void gps() {
        smartphone.setGps(true);
    }

    @Override
    public void tv() {
        smartphone.setTv(true);
    }
}
