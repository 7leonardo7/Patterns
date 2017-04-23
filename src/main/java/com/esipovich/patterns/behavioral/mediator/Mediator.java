package com.esipovich.patterns.behavioral.mediator;

public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
