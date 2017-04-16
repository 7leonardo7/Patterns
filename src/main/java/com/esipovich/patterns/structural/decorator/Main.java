package com.esipovich.patterns.structural.decorator;

import com.esipovich.patterns.structural.decorator.components.MainComponent;
import com.esipovich.patterns.structural.decorator.decorators.Decorator;
import com.esipovich.patterns.structural.decorator.decorators.DecoratorComma;
import com.esipovich.patterns.structural.decorator.decorators.DecoratorHello;
import com.esipovich.patterns.structural.decorator.decorators.DecoratorSpace;

/*  Decorator
 *  ����������� ��������� �������� ����� ����������������,
 *  ���������� �� � �������� �������
 */
public class Main {
    public static void main(String[] args) {
        Decorator decorator = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        decorator.doOperation();
        decorator.newOperation();
    }
}


/*  �����
 *  ������� ��������, ��� � ������������
 *  ��������� ��������� ����������� �� ����
 *  ����� ��������� ��������� ����� ������������ �����
 *  ��������� �������� ������������� ������� �� ������� ������� ��������
 */

/*  ������
 *  ������ ��������������� ����������� �������� �������
 *  ������� ���������� ��������� �������
 */