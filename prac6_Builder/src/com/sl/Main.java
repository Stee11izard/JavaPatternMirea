package com.sl;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        OffRoadBuilder offroad = new OffRoadBuilder();
        director.createOffRoadCars(offroad);
        System.out.println(offroad.getResult());

        SedanBuilder sedan = new SedanBuilder();
        director.createSedanCars(sedan);
        System.out.println(sedan.getResult());
    }
}