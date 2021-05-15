package com.sb.springdemo;

import com.sb.springdemo.calcs.CalcUtils;
import com.sb.springdemo.calcs.operations.Operation;
import com.sb.springdemo.cars.Car;
import com.sb.springdemo.cars.Region;
import com.sb.springdemo.cars.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        //ApplicationContext context = new AnnotationConfigApplicationContext(BasicConfiguration.class);
        /*var calcs = context.getBean(CalcUtils.class);
        System.out.println(calcs.processIntBinary(4, 7, Operation.BINARY_SUM));
        System.out.println(calcs.processIntBinary(4, 7, Operation.BINARY_DIV));
        System.out.println(calcs.processIntBinary(4, 7, Operation.BINARY_MUL));*/

        /*context.getBeansOfType(Car.class).values().forEach(Car::drive);
        context.getBeansOfType(Vehicle.class).values().forEach(Vehicle::drive);
        context.getBeansOfType(Region.class).values().forEach(Region::info);*/
    }

}
