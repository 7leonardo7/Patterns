package com.esipovich.patterns.generative.factory.creators;

import com.esipovich.patterns.generative.factory.products.ConcreteProductB;
import com.esipovich.patterns.generative.factory.products.Product;

public class ConcreteCreatorB extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
