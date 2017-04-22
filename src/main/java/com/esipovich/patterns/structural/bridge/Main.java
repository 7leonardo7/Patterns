package com.esipovich.patterns.structural.bridge;

/*  Bridge
 *  отделяет абстракцию от реализации, благодаря чему появляется возможность
 *  независимо изменять и то, и другое
 */

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = {
                new Circle(5,10,10, new LargeCircleDrawer()),
                new Circle(20,30,100, new SmallCircleDrawer())};

        for (Shape shape : shapes){
            shape.draw();
        }
    }
}

/*  Плюсы
 *  платформо-независимость
 *  реализует принцип открытости/закрытости
 *  скрывает лишние или опасные детали реализации от клиента
 */

/*  Минусы
 *  усложняет код программы за счёт дополнительных классов
 */
