package com.sl;

public class CappuccinoCoffeeFactory implements CoffeeFactory {
    @Override
    public AmericanCoffe createAmericanCoffe() {
        return new CappuccinoCoffeeAmerican();
    }

    @Override
    public ItalianCoffee createItalianCoffe() {
        return new CappuccinoCoffeeItalian();
    }
}