package com.esipovich.patterns.behavioral.strategy;

/*  Strategy
 *  определяет семейство схожих алгоритмов и помещает каждый из них в собственный класс
 *  после чего, алгоритмы можно взаимозаменять прямо во время исполнения программы
 */

public class StrategyExample {
    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3,4);

        context.setStrategy(new ConcreteStrategySub());
        int resultB = context.executeStrategy(3,4);

        context.setStrategy(new ConcreteStrategyMul());
        int resultC = context.executeStrategy(3,4);

        System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );
    }
}

/*  Плюсы
 *  горячая замена алгоритмов на лету
 *  уход от наследования к делегированию
 *  реализует принцип открытости/закрытости
 *  скрывает опасные/лишние данные алгоритма от клиента
 */

/*  Минусы
 *  усложняет программу за счёт дополнительных классов
 *  клиент должен знать в чём разница между стратегиями, чтобы выбрать подходящую
 */