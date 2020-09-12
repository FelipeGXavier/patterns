package com.algorithms.creational.builder;

public class Dimensions {

    private double weight;
    private double width;
    private double height;


    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dimensions{");
        sb.append("weight=").append(weight);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{

        private Dimensions dimensions = new Dimensions();

        public Builder withWidth(double width){
            dimensions.setWidth(width);
            return this;
        }

        public Builder withHeight(double height){
            dimensions.setHeight(height);
            return this;
        }

        public Builder withWeight(double weight){
            dimensions.setWeight(weight);
            return this;
        }

        public Dimensions build(){
            return dimensions;
        }


    }
}
