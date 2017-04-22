package com.esipovich.patterns.structural.composite;


/*  Composite (компоновщик)
 *  Группирует объекты в древовидные структуры и позволяет работать с ними так,
 *  если бы это был единичный объект
 */

public class Main {
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        graphic.print();
    }
}

/*  Плюсы
 *  упрощает архитектуру клиента при работе со сложным деревом компонентов
 *  облегчает добавление новых видов компонентов
 */

/*  Минусы
 *  создает слишком общий дизайн классов
 */