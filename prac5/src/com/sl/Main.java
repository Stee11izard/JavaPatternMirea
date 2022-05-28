package com.sl;

public class Main {
    public static void main(String[] args) {
        Singleton1 num1 = Singleton1.getInstance();
        Singleton2 num2 = Singleton2.getInstance();
        Singleton3 num3 = Singleton3.instance.getInstance();
    }
}