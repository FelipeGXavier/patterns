package com.algorithms.creational.abstractfactory.contracts;

public interface AbstractTacoFactory {

    SpicyTacoRecipe makeSpicyRecipe();
    TacoRecipe makeTacoRecipe();

}
