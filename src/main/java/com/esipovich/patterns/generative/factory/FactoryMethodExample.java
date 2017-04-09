package com.esipovich.patterns.generative.factory;

import com.esipovich.patterns.generative.factory.creators.ConcreteCreatorA;
import com.esipovich.patterns.generative.factory.creators.ConcreteCreatorB;
import com.esipovich.patterns.generative.factory.creators.Creator;
import com.esipovich.patterns.generative.factory.products.Product;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        for(Creator creator : creators){
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}
