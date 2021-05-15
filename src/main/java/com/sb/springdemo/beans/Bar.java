package com.sb.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bar {
    Foo foo;

    @Autowired
    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
