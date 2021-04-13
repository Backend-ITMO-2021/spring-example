package com.sb.springdemo.cars;

public abstract class Car implements Vehicle {
    String name;
    String carBrand;
    Region[] sailedInRegions;

    public void drive() {
        System.out.println("Driving " + carBrand + " " + name);
    }
}
