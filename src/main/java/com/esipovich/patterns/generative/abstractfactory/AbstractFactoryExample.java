package com.esipovich.patterns.generative.abstractfactory;

import com.esipovich.patterns.generative.abstractfactory.factories.AbstractFactory;
import com.esipovich.patterns.generative.abstractfactory.factories.Factory1;
import com.esipovich.patterns.generative.abstractfactory.factories.Factory2;

/*  Abstract Factory
 *  Позволяет создавать семейства связанных объектов,
 *  не привязываясь к конкретным классам
 */

public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        Client client1 = new Client(factory1);
        client1.execute();

        AbstractFactory factory2 = new Factory2();
        Client client2 = new Client(factory2);
        client2.execute();
    }
}

/*  Плюсы
 *  Позволяет конструировать семейства объектов, гарантируя их сочетаемость
 *  Избавляет от жесткой зависимости между компонентами программи
 *  Разделяет ответственность между классами
 */

/*  Минусы
 *  Усложняет код за счет множества дополнительных классов
 */

