package com.company.base;

public class Box <T>{//класс типа дженерик
    private T t;//создана приватная переменная t шаблонного типа T

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
