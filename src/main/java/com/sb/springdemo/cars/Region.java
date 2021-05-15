package com.sb.springdemo.cars;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Region {
    String name;

    @Autowired List<Car> allCars;

    List<Car> sailedCars() {
        return allCars.stream()
                .filter(p ->
                        Arrays.stream(p.sailedInRegions).anyMatch(r -> r.name.equals(name))
                ).collect(Collectors.toList());
    }

    public void info() {
        var sb = new StringBuilder();
        sb.append(name).append(" ");
        sailedCars().stream().map(p -> p.name).forEach(p -> sb.append(p).append(" "));
        System.out.println(sb);
    }
}


