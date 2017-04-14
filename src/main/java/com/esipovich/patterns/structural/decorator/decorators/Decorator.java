package com.esipovich.patterns.structural.decorator.decorators;

import com.esipovich.patterns.structural.decorator.components.InterfaceComponent;

public abstract class Decorator implements InterfaceComponent {
    protected InterfaceComponent interfaceComponent;

    public Decorator(InterfaceComponent interfaceComponent) {
        this.interfaceComponent = interfaceComponent;
    }

    public void doOperation() {
        interfaceComponent.doOperation();
    }

    public void newOperation(){
        System.out.println("Do nothing");
    }
}
