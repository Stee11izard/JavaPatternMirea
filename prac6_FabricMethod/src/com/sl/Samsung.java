package com.sl;

public class Samsung implements Phone{
    @Override
    public void turnOn(){
        System.out.println("Samsung был включен");
    }

    public static class Main {
    }
}