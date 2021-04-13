package com.sb.springdemo.cars;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public abstract class Region {
    String name;
    @Autowired Car[] allCars;

    Car[] sailedCars() {
        return Arrays.stream(allCars)
                .filter(p ->
                        Arrays.stream(p.sailedInRegions).anyMatch(r -> r.name.equals(name))
                ).toArray(Car[]::new);
    }

    public void info() {
        var sb = new StringBuilder();
        sb.append(name).append(" ");
        Arrays.stream(sailedCars()).map(p -> p.name).forEach(p -> sb.append(p).append(" "));
        System.out.println(sb);
    }
}


