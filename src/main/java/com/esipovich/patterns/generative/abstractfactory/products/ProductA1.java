package com.esipovich.patterns.generative.abstractfactory.products;

public class ProductA1 implements AbstractProductA{
    public void interact(AbstractProductB productB) {
        System.out.println(this.getClass().getName() + " interact with " + productB.getClass().getName());
    }
}
