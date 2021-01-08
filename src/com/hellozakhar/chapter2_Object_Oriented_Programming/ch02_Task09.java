/* Implement a class Car that models a car traveling along
 * the x-axis, consuming gas as it moves.
 * Provide methods:
 * * to drive by a given number of miles,
 * * to add a given number of gallons to the gas tank, and
 * * to get the current distance from the origin and fuel level.
 * Specify the fuel efficiency (in miles/gallons) in the constructor.
 * Should this be an immutable class?
 * Why or why not? */

package com.hellozakhar.chapter2_Object_Oriented_Programming;

import java.math.BigDecimal;

public class ch02_Task09 {
    public static void main(String[] args) {

        Car car = new Car(30);

        // adding 1 gallon of fuel
        car.addFuel(1);
        System.out.println(car);

        car.drive(10);
        System.out.println(car);
        car.drive(20);
        System.out.println(car);
        // fuel tank became empty
        // trying drive anyway
        car.drive(5);
        System.out.println(car);
    }
}