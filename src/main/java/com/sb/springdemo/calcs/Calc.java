package com.sb.springdemo.calcs;


import com.sb.springdemo.calcs.operations.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

interface CalcProcessor<T> {

    Operation supportedOperation();

    Optional<T> calculate(T... values);
}
