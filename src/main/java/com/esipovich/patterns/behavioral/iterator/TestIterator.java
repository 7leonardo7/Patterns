package com.esipovich.patterns.behavioral.iterator;

import java.util.ArrayList;

/*  Iterator
 *  даЄт возможность последовательно обходить все элементы составного объекта,
 *  не раскрыва€ его внутреннего представлени€
 */

public class TestIterator {
    public static void main(String args[]) {
        ArrayList<String> animalList = new ArrayList();
        animalList.add("Horse");
        animalList.add("Lion");
        animalList.add("Tiger");
        Animal animal = new Animal(animalList);
        for (String animalObj : animal) {
            System.out.println(animalObj);
        }
    }
}

/*  ѕлюсы
 *  упрощает классы хранени€ данных
 *  позвол€ет реализовать различные способы обхода структуры данных
 *  позвол€ет одновременно перемещатьс€ по структуре данных в разные стороны
 */

/*  ћинусы
 *  неоправдан, если можно обойтись простым циклом
 */
