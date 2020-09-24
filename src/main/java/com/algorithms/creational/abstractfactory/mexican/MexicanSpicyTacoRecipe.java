package com.algorithms.creational.abstractfactory.mexican;

import com.algorithms.creational.abstractfactory.SpicyToppings;
import com.algorithms.creational.abstractfactory.contracts.SpicyTacoRecipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanSpicyTacoRecipe implements SpicyTacoRecipe {

    @Override
    public String recipeTitle() {
        return "Mexican - Spicy Taco";
    }

    @Override
    public List<SpicyToppings> toppings() {
        return new ArrayList<>(
                Arrays.asList(new SpicyToppings("Jalapeno", 8000),
                              new SpicyToppings("Cayenne Pepper", 50000)));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MexicanSpicyTacoRecipe{");
        sb.append("title=").append(this.recipeTitle()).append("} ");
        sb.append("toppings=").append(this.toppings());
        sb.append('}');
        return sb.toString();
    }
}
