package com.algorithms.creational.abstractfactory.brazilian;

import com.algorithms.creational.abstractfactory.SpicyToppings;
import com.algorithms.creational.abstractfactory.contracts.SpicyTacoRecipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BrazilianSpicyTacoRecipe implements SpicyTacoRecipe {

    @Override
    public String recipeTitle() {
        return "Brazilian - Spicy Taco";
    }

    @Override
    public List<SpicyToppings> toppings() {
        return new ArrayList<>(
                Collections.singletonList(new SpicyToppings("Bell Pepper ", 0)));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BrazilianSpicyTacoRecipe{");
        sb.append("title=").append(this.recipeTitle()).append("} ");
        sb.append("toppings=").append(this.toppings());
        sb.append('}');
        return sb.toString();
    }
}
