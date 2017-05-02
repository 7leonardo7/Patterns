package com.esipovich.patterns.behavioral.templatemethod;

/*  Template method
 *  определ€ет скелет алгоритма, перекладыва€ ответственность за некоторые его шаги
 *  на подклассы.
 *  позвол€ет подклассам переопредел€ть шаги алгоритма, не мен€€ его общей структуры
 */

public class Main {
    public static void main (String [] args){
        final GameCode gameCode = GameCode.CHESS;

        Game game;

        switch (gameCode){
            case CHESS :
                game = new Chess();
                break;
            case MONOPOLY :
                game = new Monopoly();
                break;
            default :
                throw new IllegalStateException();
        }

        game.playOneGame(2);
        System.out.println(game);
    }
}

/*  ѕлюсы
 *  облегчает повторное использование кода
 */

/*  ћинусы
 *  ограниченность скелетом существующего алгоритма
 */
