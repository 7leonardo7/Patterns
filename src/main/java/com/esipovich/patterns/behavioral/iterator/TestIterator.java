package com.esipovich.patterns.behavioral.iterator;

import java.util.ArrayList;

/*  Iterator
 *  ��� ����������� ��������������� �������� ��� �������� ���������� �������,
 *  �� ��������� ��� ����������� �������������
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

/*  �����
 *  �������� ������ �������� ������
 *  ��������� ����������� ��������� ������� ������ ��������� ������
 *  ��������� ������������ ������������ �� ��������� ������ � ������ �������
 */

/*  ������
 *  ����������, ���� ����� �������� ������� ������
 */
