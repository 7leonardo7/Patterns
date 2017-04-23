package com.esipovich.patterns.behavioral.strategy;

public class ConcreteStrategySub implements Strategy{
    public int execute(int a, int b) {
        return a - b;
    }
}
