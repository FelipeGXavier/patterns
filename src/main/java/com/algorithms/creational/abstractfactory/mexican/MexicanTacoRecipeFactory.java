package com.algorithms.creational.abstractfactory.mexican;

import com.algorithms.creational.abstractfactory.contracts.AbstractTacoFactory;
import com.algorithms.creational.abstractfactory.contracts.SpicyTacoRecipe;
import com.algorithms.creational.abstractfactory.contracts.TacoRecipe;

public class MexicanTacoRecipeFactory implements AbstractTacoFactory {

    @Override
    public SpicyTacoRecipe makeSpicyRecipe() {
        return new MexicanSpicyTacoRecipe();
    }

    @Override
    public TacoRecipe makeTacoRecipe() {
        return new MexicanTacoRecipe();
    }
}
