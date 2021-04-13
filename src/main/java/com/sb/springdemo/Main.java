package com.sb.springdemo;

import com.sb.springdemo.cars.Car;
import com.sb.springdemo.cars.Region;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BasicConfiguration.class);
        context.getBeansOfType(Car.class).values().forEach(Car::drive);
        context.getBeansOfType(Region.class).values().forEach(Region::info);
    }

}
