package com.esipovich.patterns.structural.adapter;

public class ChiefAdapter implements Chief{
    private  Plumber plumber = new Plumber();

    public Object makeBreakfast() {
        return plumber.getKey();
    }

    public Object makeDinner() {
        return plumber.getScrewDriver();
    }

    public Object makeSupper() {
        return plumber.getPipe();
    }
}
