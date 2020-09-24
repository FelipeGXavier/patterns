package com.algorithms.creational.abstractfactory.mexican;

import com.algorithms.creational.abstractfactory.Toppings;
import com.algorithms.creational.abstractfactory.contracts.TacoRecipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MexicanTacoRecipe implements TacoRecipe {

    @Override
    public String recipeTitle() {
        return "Mexican - Normal Taco";
    }

    @Override
    public List<Toppings> toppings() {
        return new ArrayList<>(Collections.singletonList(new Toppings("Vinaigrette")));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MexicanTacoRecipe{");
        sb.append("title=").append(this.recipeTitle()).append("} ");
        sb.append("toppings=").append(this.toppings());
        sb.append('}');
        return sb.toString();
    }
}
