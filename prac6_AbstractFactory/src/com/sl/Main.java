package com.sl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory factory = null;
        System.out.println("Какой кофе предпочитаете?");
        Scanner in = new Scanner(System.in);
        String с = in.nextLine();
        switch (с){
            case "Латте":
                factory = new LatteCoffeeFactory();
                break;
            case "Каппучино":
                factory = new CappuccinoCoffeeFactory();
                break;
        }
        System.out.println("Американский или Итальянский " + с + "?");
        String s = in.nextLine();
        switch (s){
            case "Американский":
                factory.createAmericanCoffe();
                break;
            case "Итальянский":
                factory.createItalianCoffe();
                break;
        }
    }
}