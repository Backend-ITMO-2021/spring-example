package com.sb.springdemo.cars;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class Tesla extends Car {

    public Tesla() {
        name = "Model 3";
        carBrand = "Tesla";
        sailedInRegions = new Region[]{new USRegion()};
    }
}
