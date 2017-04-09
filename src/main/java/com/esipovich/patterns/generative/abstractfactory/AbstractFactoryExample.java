package com.esipovich.patterns.generative.abstractfactory;

import com.esipovich.patterns.generative.abstractfactory.factories.AbstractFactory;
import com.esipovich.patterns.generative.abstractfactory.factories.Factory1;
import com.esipovich.patterns.generative.abstractfactory.factories.Factory2;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        Client client1 = new Client(factory1);
        client1.execute();

        AbstractFactory factory2 = new Factory2();
        Client client2 = new Client(factory2);
        client2.execute();
    }
}
