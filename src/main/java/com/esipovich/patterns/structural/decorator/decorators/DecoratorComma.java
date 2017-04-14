package com.esipovich.patterns.structural.decorator.decorators;

import com.esipovich.patterns.structural.decorator.components.InterfaceComponent;

public class DecoratorComma extends Decorator{
    public DecoratorComma(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.println(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New Comma Operation");
    }
}
