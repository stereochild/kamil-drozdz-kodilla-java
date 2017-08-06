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
            expectedList.add(2);
            expectedList.add(144);
            expectedList.add(10);
            expectedList.add(58);

        ArrayList<Integer> theList = new ArrayList<>();
            theList.add(2);
            theList.add(5);
            theList.add(53);
            theList.add(144);
            theList.add(241);
            theList.add(10);
            theList.add(58);

        //When
        List<Integer> actualList = exterminator.exterminate(theList);

        //Then
        Assert.assertEquals(expectedList, actualList);
    }
}

