package com.esipovich.patterns.generative.abstractfactory.factories;

import com.esipovich.patterns.generative.abstractfactory.products.AbstractProductA;
import com.esipovich.patterns.generative.abstractfactory.products.AbstractProductB;

public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
