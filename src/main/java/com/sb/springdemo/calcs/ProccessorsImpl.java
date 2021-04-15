package com.sb.springdemo.calcs;

import com.sb.springdemo.calcs.operations.Operation;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
class SumProcessor extends IntegerBinaryCalcProcessor {

    @Override
    protected Integer calcInner(Integer left, Integer right) {
        return left + right;
    }

    @Override
    public Operation supportedOperation() {
        return Operation.BINARY_SUM;
    }
}

@Component
class DivProcessor extends IntegerBinaryCalcProcessor {

    @Override
    protected Integer calcInner(Integer left, Integer right) {
        return left - right;
    }

    @Override
    public Operation supportedOperation() {
        return Operation.BINARY_DIV;
    }
}