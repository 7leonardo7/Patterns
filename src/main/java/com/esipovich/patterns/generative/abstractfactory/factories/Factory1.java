package com.esipovich.patterns.generative.abstractfactory.factories;

import com.esipovich.patterns.generative.abstractfactory.products.AbstractProductA;
import com.esipovich.patterns.generative.abstractfactory.products.AbstractProductB;
import com.esipovich.patterns.generative.abstractfactory.products.ProductA1;
import com.esipovich.patterns.generative.abstractfactory.products.ProductB1;

public class Factory1 implements AbstractFactory{
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
