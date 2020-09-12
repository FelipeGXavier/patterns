package com.algorithms.creational.builder;

public class Main {

    public static void main(String[] args) {

        SmartphoneDirector director = new SmartphoneDirector(new SmartphoneLG());
        director.build(new Dimensions.Builder()
                        .withHeight(200)
                        .withWidth(100)
                        .withWeight(20)
                        .build(),
                new Screen.Builder()
                        .withInches("10'")
                        .withType(ScreenEnum.LCD)
                        .build(),
                "LG-A178", 16,2);
        System.out.println(director.get().toString());
        director = new SmartphoneDirector(new SmartphoneMotorola());
        director.build(new Dimensions.Builder()
                        .withHeight(100)
                        .withWidth(100)
                        .withWeight(40)
                        .build(),
                new Screen.Builder()
                        .withInches("5'")
                        .withType(ScreenEnum.LCD)
                        .build(),
                "LG-A178", 32,2);
        System.out.println(director.get().toString());
    }
}
