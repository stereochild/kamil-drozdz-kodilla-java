package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Exterminate Odd Numbers: begin");
    }
    @After
    public void after(){
        System.out.println("Test Exterminate Odd Numbers: end");
    }

    @Test
    public void testOddNumbersExterminatoryEmptyList(){
        ArrayList<Integer> theList = new ArrayList<>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(theList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> theList = new ArrayList<>();
        for(int i = 0; i < 51; i++){
            theList.add(i);
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(theList);
    }
}


