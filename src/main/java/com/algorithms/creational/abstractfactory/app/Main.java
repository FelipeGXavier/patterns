package com.algorithms.creational.abstractfactory.app;

import com.algorithms.creational.abstractfactory.brazilian.BrazilianTacoRecipeFactory;
import com.algorithms.creational.abstractfactory.contracts.AbstractTacoFactory;
import com.algorithms.creational.abstractfactory.contracts.SpicyTacoRecipe;
import com.algorithms.creational.abstractfactory.contracts.TacoRecipe;
import com.algorithms.creational.abstractfactory.mexican.MexicanTacoRecipeFactory;

public class Main {

    public static void main(String[] args) {

        AbstractTacoFactory mexicanFactory = new MexicanTacoRecipeFactory();
        SpicyTacoRecipe spicyTacoRecipe = mexicanFactory.makeSpicyRecipe();
        TacoRecipe tacoRecipe = mexicanFactory.makeTacoRecipe();

        AbstractTacoFactory brazilianFactory = new BrazilianTacoRecipeFactory();
        SpicyTacoRecipe spicyTacoRecipeBr = brazilianFactory.makeSpicyRecipe();
        TacoRecipe tacoRecipeBr = brazilianFactory.makeTacoRecipe();

    }
}
