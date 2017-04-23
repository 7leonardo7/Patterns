package com.esipovich.patterns.behavioral.strategy;

public class ConcreteStrategyMul implements Strategy{
    public int execute(int a, int b) {
        return a * b;
    }
}
