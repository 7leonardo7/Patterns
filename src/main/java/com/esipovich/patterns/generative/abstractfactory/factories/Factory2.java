package com.esipovich.patterns.generative.abstractfactory.factories;

import com.esipovich.patterns.generative.abstractfactory.products.AbstractProductA;
import com.esipovich.patterns.generative.abstractfactory.products.AbstractProductB;
import com.esipovich.patterns.generative.abstractfactory.products.ProductA2;
import com.esipovich.patterns.generative.abstractfactory.products.ProductB2;

public class Factory2 implements AbstractFactory{
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
