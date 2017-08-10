package com.kodilla.stream.forum.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World myNewGreatWorld = new World();

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");

        Country portugal = new Country("Portugal", new BigDecimal("10320000"));
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country spain = new Country("Spain", new BigDecimal("465600000"));
        Country egipt = new Country("Egipt", new BigDecimal("956900000"));
        Country congo = new Country("Congo", new BigDecimal("822400000"));
        Country japan = new Country("Japan", new BigDecimal("127000000"));
        Country china = new Country("China", new BigDecimal("1379000000"));

        //When
        myNewGreatWorld.addContinent(europe);
        myNewGreatWorld.addContinent(africa);
        myNewGreatWorld.addContinent(asia);

        europe.addCountry(portugal);
        europe.addCountry(poland);
        europe.addCountry(spain);
        africa.addCountry(egipt);
        africa.addCountry(congo);
        asia.addCountry(japan);
        asia.addCountry(china);

        BigDecimal worldPopulation = myNewGreatWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("3799220000");
        Assert.assertEquals(expectedPopulation, worldPopulation);

        Assert.assertEquals(3, europe.getCountries().size());
        Assert.assertEquals(2, africa.getCountries().size());
        Assert.assertEquals(2, asia.getCountries().size());
        Assert.assertEquals(3, myNewGreatWorld.getContinents().size());
    }
}
