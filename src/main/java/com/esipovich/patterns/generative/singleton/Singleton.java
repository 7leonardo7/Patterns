package com.esipovich.patterns.generative.singleton;

   /*   Singleton
    *   гарантирует, что у класса есть только один экземпл€р
    *   и предоставл€ет к нему глобальную точку доступа
    */

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
