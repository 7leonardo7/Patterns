package com.esipovich.patterns.generative.builder;

import com.esipovich.patterns.generative.builder.builders.HawaiianPizzaBuilder;
import com.esipovich.patterns.generative.builder.builders.PizzaBuilder;
import com.esipovich.patterns.generative.builder.director.Waiter;
import com.esipovich.patterns.generative.builder.product.Pizza;

/*  Builder
 *  Позволяет конструировать объекты пошагово и производить различные продукты,
 *  используя один и тот же порядок строительства
 */


public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}

/*  Плюсы
 *  позволяет создавать продукт пошагово
 *  позволяет использовать один и тот же код для создания различных продуктов
 *  изолирует сложный код сборки продукта от его основной бизнес-логики
 */

/*  Минусы
 *  усложняет код за счет дополнительных классов
 */
