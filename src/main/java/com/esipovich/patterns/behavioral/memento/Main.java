package com.esipovich.patterns.behavioral.memento;

/*  Memento (хранитель)
 *  позволяет делать снимок состояния объекта, не раскрывая подробностей его реализации
 *  позже можно будет восстановить прошлое состояние объекта, используя этот снимок
 */

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("off");
        System.out.printf("State is %s\n", originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.printf("State is %s\n", originator.getState());
    }
}

/*  Плюсы
 *  не нарушает инкапсуляции исходного объекта
 *  упрощает структуру исходного объекта. Ему не нужно хранить историю версий
 *  своего состояния
 */

/*  Минусы
 *  требует много памяти, если клиенты слишком часто создают снимки
 *  может повлечь дополнительные издержки памяти, если объекты хранящие историю не
 *  освобождают ресурсы, занятые устаревшими снимками
 */