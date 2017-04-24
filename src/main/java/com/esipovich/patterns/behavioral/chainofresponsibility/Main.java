package com.esipovich.patterns.behavioral.chainofresponsibility;

/*  Chain of responsibility (цепочка об€занностей)
 *  св€зывает объекты-получатели в цепочку и передаЄт запрос вдоль этой цепочки,
 *  пока его не обработают.
 *  избавл€ет от жЄсткой прив€зки отправител€ запроса к его получателю,
 *  позвол€€ выстраивать цепь из различных обработчиков динамически
 */

public class Main {
    public static void main(String[] args) {
        Logger logger, logger1,logger2;
        logger = new StdoutLogger(Logger.DEBUG);
        logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(Logger.ERR));

        logger.message("Entering function y.", Logger.DEBUG);

        logger.message("Step1 completed.", Logger.NOTICE);

        logger.message("An error has occurred.", Logger.ERR);
    }
}

/*  ѕлюсы
 *  уменьшает зависимость между клиентом и обработчиками
 *  соблюдает принцип единственной об€занности класса
 *  соблюдает принцип открытости/закрытости
 */

/*  ћинусы
 *  запрос может остатьс€ никем не обработанным
 */