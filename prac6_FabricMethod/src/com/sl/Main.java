package com.sl;

public class Main {
    public static void main(String[] args) {
        FactoryMethod samsung = new SamsungFactoryMethod();
        FactoryMethod iphone = new HuaweiFactoryMethod();
        samsung.start();
        iphone.start();
    }
}