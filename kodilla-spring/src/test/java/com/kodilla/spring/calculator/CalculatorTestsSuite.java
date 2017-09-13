package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestsSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(3,4);
        double sub = calculator.sub(8,2);
        double mul = calculator.mul(2.5, 2);
        double div = calculator.div(8, 2);
        //Then
        Assert.assertEquals(7, add, 0.01);
        Assert.assertEquals(6, sub, 0.01);
        Assert.assertEquals(5, mul, 0.01);
        Assert.assertEquals(4, div, 0.01);
    }
}
