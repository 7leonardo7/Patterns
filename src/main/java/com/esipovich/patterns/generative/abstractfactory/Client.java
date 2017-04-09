package com.esipovich.patterns.generative.abstractfactory;

import com.esipovich.patterns.generative.abstractfactory.factories.AbstractFactory;
import com.esipovich.patterns.generative.abstractfactory.products.AbstractProductA;
import com.esipovich.patterns.generative.abstractfactory.products.AbstractProductB;

public class Client {
    private AbstractProductA productA;
    private AbstractProductB productB;

    public Client(AbstractFactory factory){
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void execute(){
        productB.interact(productA);
    }
}
