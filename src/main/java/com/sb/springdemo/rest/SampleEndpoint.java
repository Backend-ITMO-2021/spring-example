package com.sb.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${test-endpoint}")
public class SampleEndpoint {

    @GetMapping
    public String hello(@RequestParam(required = false, defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }
}
