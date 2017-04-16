package com.esipovich.patterns.structural.decorator;

import com.esipovich.patterns.structural.decorator.components.MainComponent;
import com.esipovich.patterns.structural.decorator.decorators.Decorator;
import com.esipovich.patterns.structural.decorator.decorators.DecoratorComma;
import com.esipovich.patterns.structural.decorator.decorators.DecoratorHello;
import com.esipovich.patterns.structural.decorator.decorators.DecoratorSpace;

/*  Decorator
 *  Динамически добавляет объектам новую функциональность,
 *  оборачивая их в полезные «обёртки»
 */
public class Main {
    public static void main(String[] args) {
        Decorator decorator = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        decorator.doOperation();
        decorator.newOperation();
    }
}


/*  Плюсы
 *  большая гибкость, чем у наследования
 *  позволяет добавлять обязанности на лету
 *  можно добавлять несколько новых обязанностей сразу
 *  позволяет избежать перегруженных классов на верхних уровнях иерархии
 */

/*  Минусы
 *  трудно конфигурировать многократно обёрнутые объекты
 *  большое количество крошечных классов
 */