package com.sb.springdemo.calcs;

import org.springframework.stereotype.Component;

import java.util.Optional;


public abstract class IntegerBinaryCalcProcessor implements CalcProcessor<Integer> {

    abstract protected Integer calcInner(Integer left, Integer right);

    @Override
    public Optional<Integer> calculate(Integer... values) {
        if(values.length != 2)
            return Optional.empty();
        else return Optional.of(calcInner(values[0], values[1]));
    }
}
