package com.sb.springdemo.cars;

import org.springframework.stereotype.Component;

@Component
public class Tesla extends Car {

    public Tesla() {
        name = "Model 3";
        carBrand = "Tesla";
        sailedInRegions = new Region[]{new USRegion()};
    }
}
