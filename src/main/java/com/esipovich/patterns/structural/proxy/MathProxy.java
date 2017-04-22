package com.esipovich.patterns.structural.proxy;

public class MathProxy implements IMath{

    private Math math;

    public double add(double x, double y) {
        if(math == null){
            math = new Math();
        }
        return math.add(x, y);
    }

    public double sub(double x, double y) {
        if(math == null){
            math = new Math();
        }
        return math.sub(x, y);
    }

    public double mul(double x, double y) {
        if(math == null){
            math = new Math();
        }
        return math.mul(x, y);
    }

    public double div(double x, double y) {
        if(math == null){
            math = new Math();
        }
        return math.div(x, y);
    }
}
