package com.algorithms.creational.abstractfactory;

public class SpicyToppings extends Toppings{

    // Escala que indica quanto um tempero/pimenta é forte
    private int scovilleScale;

    public SpicyToppings(String name, int scovilleScale) {
        super(name);
        this.scovilleScale = scovilleScale;
    }

    public int getScovilleScale() {
        return scovilleScale;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SpicyToppings{");
        sb.append(super.toString());
        sb.append("scovilleScale=").append(scovilleScale);
        sb.append('}');
        return sb.toString();
    }
}
