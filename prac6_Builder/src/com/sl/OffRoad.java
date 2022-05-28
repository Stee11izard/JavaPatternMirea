package com.sl;

public class OffRoad {
    private String carName;
    private int seats;
    private int power;
    private boolean isOffRoad;

    public OffRoad(String carName, int seats, int power, boolean isOffRoad) {
        this.carName = carName;
        this.seats = seats;
        this.power = power;
        this.isOffRoad = isOffRoad;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String nameCar) {
        this.carName = nameCar;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isOffRoad() {
        return isOffRoad;
    }

    public void setOffRoad(boolean offRoad) {
        isOffRoad = offRoad;
    }

    @Override
    public String toString() {
        return "OffRoad " +
                carName +
                ", with " + seats +
                " seats and " + power +
                " horsepower";
    }
}