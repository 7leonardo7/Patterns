package com.esipovich.patterns.generative.factory.creators;

import com.esipovich.patterns.generative.factory.products.ConcreteProductA;
import com.esipovich.patterns.generative.factory.products.Product;

public class ConcreteCreatorA extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
