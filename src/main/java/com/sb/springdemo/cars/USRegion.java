package com.sb.springdemo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class USRegion extends Region {
    public USRegion() {
        this.name = "US";
    }
}
