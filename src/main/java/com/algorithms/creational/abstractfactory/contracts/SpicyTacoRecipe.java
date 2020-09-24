package com.algorithms.creational.abstractfactory.contracts;

import com.algorithms.creational.abstractfactory.SpicyToppings;

import java.util.List;

public interface SpicyTacoRecipe {

    String recipeTitle();
    List<SpicyToppings> toppings();
}
