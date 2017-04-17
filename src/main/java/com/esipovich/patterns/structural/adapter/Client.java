package com.esipovich.patterns.structural.adapter;


/*  Adapter
 *  Обеспечивает совместную работу классов с несовместимыми интерфейсами
 */
public class Client {
    public static void main(String[] args) {
        Chief chief = new ChiefAdapter();

        Object key = chief.makeDinner();
    }
}

/*  Плюсы
 *  отделяет и скрывает от клиента подробности преобразования различных интерфейсов
 */

/*  Минусы
 *  усложняет код программы за счёт дополнительных классов
 */