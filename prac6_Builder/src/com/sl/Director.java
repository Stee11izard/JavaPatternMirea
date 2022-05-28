package com.sl;

public class Director {
    public void createOffRoadCars(Builder builder){
        builder.setName("Jeep");
        builder.setSeats(2);
        builder.setPower(300);
        builder.setOffRoad(true);
    }

    public void createSedanCars(Builder builder){
        builder.setName("Nissan");
        builder.setSeats(4);
        builder.setPower(150);
        builder.setOffRoad(false);
    }
}