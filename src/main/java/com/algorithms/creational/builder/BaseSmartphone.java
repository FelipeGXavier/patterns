package com.algorithms.creational.builder;

public class BaseSmartphone {

    private Dimensions dimensions;
    private Screen screen;
    private String model;
    private int memory;
    private int ramMemory;
    private boolean radio;
    private boolean gps;
    private boolean tv;

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public boolean isRadio() {
        return radio;
    }

    public boolean isGps() {
        return gps;
    }

    public boolean isTv() {
        return tv;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseSmartphone{");
        sb.append("dimensions=").append(dimensions);
        sb.append(", screen=").append(screen);
        sb.append(", model='").append(model).append('\'');
        sb.append(", memory=").append(memory);
        sb.append(", ramMemory=").append(ramMemory);
        sb.append(", radio=").append(radio);
        sb.append(", gps=").append(gps);
        sb.append(", tv=").append(tv);
        sb.append('}');
        return sb.toString();
    }
}
