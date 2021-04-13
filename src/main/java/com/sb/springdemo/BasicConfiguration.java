package com.sb.springdemo;

import com.sb.springdemo.cars.Car;
import com.sb.springdemo.cars.CarsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
@Import(CarsConfiguration.class)
public class BasicConfiguration {

}
