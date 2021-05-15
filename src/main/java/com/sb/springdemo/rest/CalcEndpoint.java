package com.sb.springdemo.rest;


import com.sb.springdemo.calcs.CalcUtils;
import com.sb.springdemo.calcs.operations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("${calc-endpoint}")
public class CalcEndpoint {

    @Autowired CalcUtils calcUtils;

    /*@GetMapping
    public String binaryOp(@RequestParam Integer left, @RequestParam Integer right) {
        return calcUtils.processIntBinary(left, right, Operation.BINARY_SUM)
                .map(Object::toString).orElse("Error Occurred!");
    }*/

    @GetMapping
    public String binaryOpWithSelect(@RequestParam Integer left, @RequestParam Integer right, @RequestParam(required = false, defaultValue = "sum") String operation) {
        Optional<Operation> selectedOper = Optional.empty();
        switch (operation) {
            case "sum":
                selectedOper = Optional.of(Operation.BINARY_SUM);
                break;
            case "div":
                selectedOper = Optional.of(Operation.BINARY_DIV);
                break;
        }
        return selectedOper.flatMap(oper -> calcUtils.processIntBinary(left, right, oper))
                .map(Object::toString).orElse("Error Occurred!");
    }

}
