package com.esipovich.patterns.behavioral.observer;

/*  Observer (наблюдатель)
 *  создаёт механизм подписки, с помощью которого одни объекты могут подписываться
 *  на обновления, происходящие в других объектах
 */

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}

/*  Плюсы
 *  издатель не зависит от конкретных классов подписчиков
 *  вы можете подписывать и отписывать получателей на лету
 *  реализует принцип открытости/закрытости
 */

/*  Минусы
 *  наблюдатели оповещаются в случайном порядке
 *  код подписки издателя можно только унаследовать, поэтому его сложно
 *  интегрировать в существующее дерево классов
 */
