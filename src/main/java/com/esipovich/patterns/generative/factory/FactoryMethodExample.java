package com.esipovich.patterns.generative.factory;

import com.esipovich.patterns.generative.factory.creators.ConcreteCreatorA;
import com.esipovich.patterns.generative.factory.creators.ConcreteCreatorB;
import com.esipovich.patterns.generative.factory.creators.Creator;
import com.esipovich.patterns.generative.factory.products.Product;

/*  Factory
 *  Определяет интерфейс для создания объектов, но позволяет
 *  подклассам изменять тип создаваемых объектов
 */

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        for(Creator creator : creators){
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}

/*  Плюсы
 *  Реализует принцип открытости/закрытости
 *  Позволяет не привязывать код приложения к конкретным классам
 *  Упрощает программу за счёт выноса кода создания объектов в одно место
 *  Упрощает внесение в программу объектов новых классов
 */

/*  Минусы
 *  Для указания типа создаваемых объектов требуются подклассы
 */
