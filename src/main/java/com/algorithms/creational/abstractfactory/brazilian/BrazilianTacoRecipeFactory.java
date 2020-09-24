package com.algorithms.creational.abstractfactory.brazilian;

import com.algorithms.creational.abstractfactory.contracts.AbstractTacoFactory;
import com.algorithms.creational.abstractfactory.contracts.SpicyTacoRecipe;
import com.algorithms.creational.abstractfactory.contracts.TacoRecipe;

public class BrazilianTacoRecipeFactory implements AbstractTacoFactory {

    @Override
    public SpicyTacoRecipe makeSpicyRecipe() {
        return new BrazilianSpicyTacoRecipe();
    }

    @Override
    public TacoRecipe makeTacoRecipe() {
        return new BrazilianTacoRecipe();
    }
}
