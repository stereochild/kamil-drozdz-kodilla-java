package com.kodilla.patterns.builder.pizza;

import com.kodilla.patterns.builder.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Mushrooms")
                .ingredient("Onion")
                .ingredient("Ham")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
