package com.algorithms.creational.builder;

public class Screen {

    private String inches;
    private ScreenEnum type;

    private Screen(){

    }

    public String getInches() {
        return inches;
    }

    public ScreenEnum getType() {
        return type;
    }

    private void setInches(String inches) {
        this.inches = inches;
    }

    private void setType(ScreenEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Screen{");
        sb.append("inches='").append(inches).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{

        private Screen screen = new Screen();

        public Builder withInches(String inches){
            screen.setInches(inches);
            return this;
        }

        public Builder withType(ScreenEnum type){
            screen.setType(type);
            return this;
        }

        public Screen build(){
            return screen;
        }


    }


}
