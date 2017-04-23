package com.esipovich.patterns.behavioral.strategy;

/*  Strategy
 *  ���������� ��������� ������ ���������� � �������� ������ �� ��� � ����������� �����
 *  ����� ����, ��������� ����� �������������� ����� �� ����� ���������� ���������
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

/*  �����
 *  ������� ������ ���������� �� ����
 *  ���� �� ������������ � �������������
 *  ��������� ������� ����������/����������
 *  �������� �������/������ ������ ��������� �� �������
 */

/*  ������
 *  ��������� ��������� �� ���� �������������� �������
 *  ������ ������ ����� � ��� ������� ����� �����������, ����� ������� ����������
 */