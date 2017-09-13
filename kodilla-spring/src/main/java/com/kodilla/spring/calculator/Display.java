package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Display {

    public void displayValue(double val) {
        System.out.println("Value: " + val);
    }
}
