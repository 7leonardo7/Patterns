package com.esipovich.patterns.generative.abstractfactory.products;

public class ProductB2 implements AbstractProductB{
    public void interact(AbstractProductA productA) {
        System.out.println(this.getClass().getName() + " interact with " + productA.getClass().getName());
    }
}
