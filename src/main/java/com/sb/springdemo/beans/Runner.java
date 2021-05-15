package com.sb.springdemo.beans;

import com.sb.springdemo.BasicConfiguration;
import com.sb.springdemo.calcs.CalcUtils;
import com.sb.springdemo.calcs.operations.Operation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        Bar bar = context.getBean(Bar.class);
        System.out.println(bar.foo);
    }
}
