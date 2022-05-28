package com.sl;

public class HuaweiFactoryMethod extends FactoryMethod {
    @Override
    public Phone createPhone() {
        return new Huawei();
    }
}