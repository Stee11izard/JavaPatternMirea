package com.sl;

public abstract class FactoryMethod {
    public void start(){
        Phone phone = createPhone();
        phone.turnOn();
    }
    public abstract Phone createPhone();
}