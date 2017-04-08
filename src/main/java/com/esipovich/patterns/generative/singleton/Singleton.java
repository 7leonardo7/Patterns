package com.esipovich.patterns.generative.singleton;

   /*   Singleton
    *   гарантирует, что у класса есть только один экземпл€р
    *   и предоставл€ет к нему глобальную точку доступа
    */

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
        return instance;
    }
}

/*  ѕлюсы
    * позвол€ет ленивую инициализацию
    * гарантирует единственный экземпл€р
*/

/*  ћинусы
    * нарушает принцип единственной об€занности класса
    * маскирует плохой дизайн
    * проблемы мультипоточности
    * проблемы юнит-тестировани€
*/

