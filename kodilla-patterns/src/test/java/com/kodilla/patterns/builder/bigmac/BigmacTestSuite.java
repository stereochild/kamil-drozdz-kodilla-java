package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                            .roll("Sesame roll")
                            .burgers(2)
                            .sauce("Thousand Island dressing")
                            .ingredient("Onion")
                            .ingredient("Pickle")
                            .ingredient("Becon")
                            .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String kindOfRoll = bigmac.getRoll();
        String kindOfSauce = bigmac.getSauce();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("Sesame roll", kindOfRoll);
        Assert.assertEquals("Thousand Island dressing", kindOfSauce);
    }
}
