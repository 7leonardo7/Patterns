package com.esipovich.patterns.generative.builder;

import com.esipovich.patterns.generative.builder.builders.HawaiianPizzaBuilder;
import com.esipovich.patterns.generative.builder.builders.PizzaBuilder;
import com.esipovich.patterns.generative.builder.director.Waiter;
import com.esipovich.patterns.generative.builder.product.Pizza;

/*  Builder
 *  ��������� �������������� ������� �������� � ����������� ��������� ��������,
 *  ��������� ���� � ��� �� ������� �������������
 */


public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}

/*  �����
 *  ��������� ��������� ������� ��������
 *  ��������� ������������ ���� � ��� �� ��� ��� �������� ��������� ���������
 *  ��������� ������� ��� ������ �������� �� ��� �������� ������-������
 */

/*  ������
 *  ��������� ��� �� ���� �������������� �������
 */
