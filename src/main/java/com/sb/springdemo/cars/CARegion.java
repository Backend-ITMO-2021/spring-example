package com.sb.springdemo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CARegion extends Region {
    public CARegion() {
        this.name = "CA";
    }
}