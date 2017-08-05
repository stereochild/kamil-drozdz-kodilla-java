package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Exterminate Odd Numbers: begin");
    }

    @After
    public void after() {
        System.out.println("Test Exterminate Odd Numbers: end");
    }

    @Test
    public void testOddNumbersExterminatoryEmptyList() {

        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> expectedList = new ArrayList<>();
        ArrayList<Integer> theList = new ArrayList<>();

        //When
        List<Integer> actualList = exterminator.exterminate(theList);

        //Then
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> expectedList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                expectedList.add(i);
            }
        }

        ArrayList<Integer> theList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            theList.add(i);
        }

        //When
        List<Integer> actualList = exterminator.exterminate(theList);

        //Then
        Assert.assertEquals(expectedList, actualList);
    }
}

