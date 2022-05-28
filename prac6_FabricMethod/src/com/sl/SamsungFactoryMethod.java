package com.sl;

public class SamsungFactoryMethod extends FactoryMethod {
    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}