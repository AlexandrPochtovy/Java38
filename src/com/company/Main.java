package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// initial feature branch for Lesson8


    }

    //генерирует массив ArrayList заданного размера заранее выделяя память
    public static ArrayList<Integer> GenerateArrayListMem(int size) {
        ArrayList<Integer> data = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            data.set(i, (int)(Math.random() * size));
        }
        return data;
    }
    //генерирует массив ArrayList заданного размера выделяя память динамически
    public static ArrayList<Integer> GenerateArrayListNew(int size) {
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * size));
        }
        return data;
    }

    //генерирует массив LinkedList заданного размера выделяя память динамически
    public static LinkedList<Integer> GenerateLinkedListNew(int size) {
        LinkedList<Integer> data = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * size));
        }
        return data;
    }

    //чтение элемента ArrayList
    public static void GerArrayList(ArrayList<Integer> data) {
        int len = data.size();
        int index;
        for (int i = 0; i < len; i++) {
            index = Math.max((int)(Math.random() * len), len);
            data.get(index);
        }
    }
    //чтение элемента LinkedList
    public static void GerArrayList(LinkedList<Integer> data) {
        int len = data.size();
        int index;
        for (int i = 0; i < len; i++) {
            index = Math.max((int)(Math.random() * len), len);
            data.get(index);
        }
    }
}
