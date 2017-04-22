package com.esipovich.patterns.structural.facade;

/*  Facade
 *  Предоставляет единый простой интерфейс к множеству интерфейсов
 *  в некоторой сложной подсистеме
 */

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}

/*  Плюсы
 *  изолирует клиентов от компонентов системы
 *  уменьшает зависимость между подсистемой и клиентами
 */

/*  Минусы
 *  фасад рискует стать «божественным объектом»
 */
