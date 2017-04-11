package com.esipovich.patterns.generative.builder.director;

import com.esipovich.patterns.generative.builder.builders.PizzaBuilder;
import com.esipovich.patterns.generative.builder.product.Pizza;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void constructPizza(){
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
