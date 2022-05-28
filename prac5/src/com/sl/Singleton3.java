package com.sl;

public enum Singleton3 {
    instance;
    public Singleton3 getInstance(){
        System.out.println("3.через enum");
        return instance;
    }
}