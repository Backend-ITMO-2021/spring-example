package com.sb.springdemo.cars;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class Skoda extends Car {
    public Skoda() {
        name = "Scala";
        carBrand = "Skoda";
        sailedInRegions = new Region[]{new USRegion(), new CARegion()};
    }
}

