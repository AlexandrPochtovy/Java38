package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // initial feature branch for Lesson8
        int size = 1000000;
        Date time1;
        Date time2;
        long deltaArray;//затраты времени на заполнение ArrayList с динамической памятью
        long deltaList;//затраты времени на заполнение LinkedList

        time1 = new Date();
        ArrayList array1 = GenerateArrayList(size);
        time2 = new Date();
        deltaArray = time2.getTime() - time1.getTime();
        System.out.println("Заполнение " + size + " елементов ArrayList занимает " + deltaArray + "мсек");

        time1 = new Date();
        LinkedList list1 = GenerateLinkedList(size);
        time2 = new Date();
        deltaList = time2.getTime() - time1.getTime();
        System.out.println("Заполнение " + size + " елементов LinkedList занимает " + deltaList + "мсек");

        time1 = new Date();
        GetArrayList(array1);
        time2 = new Date();
        deltaArray = time2.getTime() - time1.getTime();
        System.out.println("Произвольное чтение " + size + " елементов ArrayList занимает " + deltaArray + "мсек");

        time1 = new Date();
        GetArrayList(list1);
        time2 = new Date();
        deltaList = time2.getTime() - time1.getTime();
        System.out.println("Произвольное чтение " + size + " елементов LinkedList занимает " + deltaList + "мсек");
    }

    //генерирует массив ArrayList заданного размера выделяя память динамически
    public static ArrayList<Integer> GenerateArrayList(int size) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            data.add((int) (Math.random() * size));
        }
        return data;
    }

    //генерирует массив LinkedList заданного размера выделяя память динамически
    public static LinkedList<Integer> GenerateLinkedList(int size) {
        LinkedList<Integer> data = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            data.add((int) (Math.random() * size));
        }
        return data;
    }

    //чтение элемента ArrayList
    public static void GetArrayList(ArrayList<Integer> data) {
        int len = data.size();
        int index;
        for (int i = 0; i < len; i++) {
            index = Math.max((int) (Math.random() * len - 1), len - 1);
            int temp = data.get(index);
        }
    }

    //чтение элемента LinkedList
    public static void GetArrayList(LinkedList<Integer> data) {
        int len = data.size();
        int index;
        for (int i = 0; i < len; i++) {
            index = Math.max((int) (Math.random() * len - 1), len - 1);
            int temp = data.get(index);
        }
    }
}
