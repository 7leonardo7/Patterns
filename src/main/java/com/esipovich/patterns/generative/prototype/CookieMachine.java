package com.esipovich.patterns.generative.prototype;

/*  Prototype
 * Позволяет копировать существующие объекты, не вдаваясь в подробности их реализации.
 */

public class CookieMachine {
    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException{
        return (Cookie) this.cookie.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Cookie tempCookie = null;
        Cookie prot = new CoconutCookie();
        CookieMachine cookieMachine = new CookieMachine(prot);
        for(int i = 0; i < 100; i++){
            tempCookie = cookieMachine.makeCookie();
        }
    }
}

/*  Плюсы
 *  позволяет клонировать объекты, без привязки к их конкретным классам
 *  меньше повторяющегося кода инициализации объектов
 *  ускоряет создание объектов
 *  альтернатива созданию подклассов для конструирования сложных объектов
 */

/*  Минусы
 *  сложно клонировать составные объекты, имеющие ссылки на другие объекты
 */