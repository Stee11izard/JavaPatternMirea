package com.sl;

public class Singleton1 {
    private Singleton1(){
        System.out.println("1.Реализация Била Пью");
    }

    private static class SingletonHolder{
        private final static Singleton1 instance = new Singleton1();
    }

    public static Singleton1 getInstance(){
        return SingletonHolder.instance;
    }
}