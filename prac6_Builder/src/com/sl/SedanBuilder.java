package com.sl;

public class SedanBuilder implements Builder{
    private String nameCar;
    private int seats;
    private int power;
    private boolean isOffRoad;
    @Override
    public void setName(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void setOffRoad(boolean isSportCar) {
        this.isOffRoad = isOffRoad;
    }

    public Sedan getResult(){
        return new Sedan(nameCar, seats, power, isOffRoad);
    }
}