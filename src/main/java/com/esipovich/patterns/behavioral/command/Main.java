package com.esipovich.patterns.behavioral.command;

/*  Command
 *  превращает операцию в объект. Это позволяет передавать операции как аргументы
 *  при вызове методов, ставить операции в очередь, логировать их,
 *  а также поддерживать отмену операций
 */

public class Main {
    public static void main(String[] args){
        Light l=new Light();
        Command switchUp=new TurnOnLightCommand(l);
        Command switchDown=new TurnOffLightCommand(l);

        Switch s=new Switch(switchUp,switchDown);

        s.flipUp();
        s.flipDown();
    }
}

/*  Плюсы
 *  убирает зависимость между разными слоями программы
 *  простая отмена и повтор команд.
 *  отложенный запуск команд
 *  комбинирование команд
 *  соблюдает принцип открытости/закрытости.
 */

/*  Минусы
 *  усложняет код программы за счёт дополнительных классов
 */
