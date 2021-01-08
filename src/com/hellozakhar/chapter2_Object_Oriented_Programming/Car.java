package com.hellozakhar.chapter2_Object_Oriented_Programming;

import java.math.BigDecimal;

class Car {
    // total distance (miles)
    private int distance;
    // number of gallons
    private double fuel;
    // fuel efficiency (miles per gallon)
    private double efficiency;

    public Car(double efficiency) {
        this.efficiency = efficiency;
    }

    public void drive(int distance) {
        if (distance < 1 || fuel <= 0.0) {
            System.out.println("Fuel tank is empty! Driving is not possible!");
            return;
        }

        int remainDistance = this.getRemainDistance();

        if (distance > remainDistance)
            distance = remainDistance;

        fuel -= this.getFuelByDistance(distance);

        if (fuel < 0.0)
            fuel = 0.0;

        fuel = BigDecimal.valueOf(fuel)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();

        this.distance += distance;
    }

    public void addFuel(double fuel) {
        this.fuel += fuel;
    }

    public int getRemainDistance() {
        return (int) Math.round(fuel * efficiency);
    }

    private double getFuelByDistance(int distance) {
        return BigDecimal.valueOf(distance / efficiency)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
    }

    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", remain distance=" + getRemainDistance() +
                ", fuel=" + fuel +
                ", efficiency=" + efficiency +
                '}';
    }
}