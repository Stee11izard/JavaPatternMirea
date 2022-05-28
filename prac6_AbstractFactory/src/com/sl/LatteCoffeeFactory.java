package com.sl;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public AmericanCoffe createAmericanCoffe() {
        return new LatteCoffeeAmerican();
    }

    @Override
    public ItalianCoffee createItalianCoffe() {
        return new LatteCoffeeItalian();
    }
}