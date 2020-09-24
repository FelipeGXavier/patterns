package com.algorithms.creational.abstractfactory.brazilian;

import com.algorithms.creational.abstractfactory.Toppings;
import com.algorithms.creational.abstractfactory.contracts.TacoRecipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrazilianTacoRecipe implements TacoRecipe {

    @Override
    public String recipeTitle() {
        return "Brazilian - Normal Taco";
    }

    @Override
    public List<Toppings> toppings() {
        return new ArrayList<>(Collections.singletonList(new Toppings("Cheese")));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BrazilianTacoRecipe{");
        sb.append("title=").append(this.recipeTitle()).append("} ");
        sb.append("toppings=").append(this.toppings());
        sb.append('}');
        return sb.toString();
    }
}
