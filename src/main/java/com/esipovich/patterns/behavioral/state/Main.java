package com.esipovich.patterns.behavioral.state;

/*  State
 *  позволяет объекту менять своё поведение в зависимости от своего состояния
 */

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}

/*  Плюсы
 *  избавляет от множества больших условных операторов
 *  концентрирует в одном месте код, связанный с определённым состоянием
 *  упрощает код контекста
 */

/*  Минусы
 *  может неоправданно усложнить код, если состояний мало и они редко меняются
 */
