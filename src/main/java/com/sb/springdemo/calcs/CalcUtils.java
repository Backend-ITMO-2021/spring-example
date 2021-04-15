package com.sb.springdemo.calcs;

import com.sb.springdemo.calcs.operations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class CalcUtils {

    @Autowired IntegerBinaryCalcProcessor[] processors;

    public Optional<Integer> processIntBinary(Integer a, Integer b, Operation op) {
        return Arrays.stream(processors).filter(p -> p.supportedOperation().equals(op)).findFirst().flatMap(p -> p.calculate(a, b));
    }

}
