package com.esipovich.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Decorator decorator = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        decorator.doOperation();
        decorator.newOperation();
    }
}
