package com.algorithms.creational.abstractfactory.contracts;

import com.algorithms.creational.abstractfactory.Toppings;

import java.util.List;

public interface TacoRecipe {

    String recipeTitle();
    List<Toppings> toppings();

}
