package com.sl;

public class Main {
    public static void main(String[] args) {
        ComplicateObject prototype = new ComplicateObject(1);
        prototype.setData(1);
        ComplicateObject clone = prototype.copy();
        System.out.println(clone.getData());
    }
}